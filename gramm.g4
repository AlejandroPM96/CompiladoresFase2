grammar gramm;

/*
if any of subcheck-Validation Failed and if within 2 minutes greater than 5 events occur
having different username and having same source ip XML for Failed Login Attempts from the Same Source

if any of subcheck-Validation Succeeded and if 1.1.1.1 is the ip address XML for Succeeded Login Attempts from the Same Source

if any of subcheck-Validation Succeeded and if AnaKaren is Disabled XML for Succeeded Login Attempts from the Same Source
 */

//Parser rules
corrule: check+ XML  query*;
check: 'if' cond (LOGICALOPERATOR 'if' complement)*;
query: 'for' STATUS queryObject;
queryObject: 'Login Attempts from the Same Source';
cond: QUANTITATIVE 'of' mainCondition;
mainCondition: SUBCHECK STATUS;
complement: RELOP INT TIMEUNIT events
            |IP 'is the ip address' (LOGICALOPERATOR complement)*
            |ID 'is' STATUSUSER;
events: RELOP INT 'events occur' (condition)*;
condition: (LOGICALOPERATOR)* 'having' QUANTITATIVE OBJECT;


//Lexer rules

QUANTITATIVE: 'any'|'some'|'all'|'none'|'different'|'same';
OBJECT: 'username'|'ip'|'password'|'id'|'source ip';
RELOP: 'less than'|'greater than'|'equals to'|'within';
STATUS: 'Failed' | 'Accepted' | 'Succeeded' | 'failed' | 'accepted' | 'succeeded';
TIMEUNIT: 'seconds'|'minutes'|'hours' | 'days';
LOGICALOPERATOR: 'and'|'or';
STATUSUSER: 'Enabled' | 'Disabled' | 'enabled' | 'disabled';
XML: 'xml'|'XML';
SUBCHECK: 'subcheck-Validation';
INT: [0-9]+;
ID: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;
IP: INT'.'INT'.'INT'.'INT;