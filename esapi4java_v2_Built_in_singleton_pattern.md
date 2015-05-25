The ESAPI security control interfaces include an “ESAPI” class that is commonly referred to as a “locator” class. The ESAPI locator class is called in order to retrieve singleton instances of individual security controls, which are then called in order to perform security checks (such as performing an access control check) or that result in security effects (such as generating an audit record).

The “built‐in” singleton pattern refers to the replacement of security control reference implementations with your own implementations. ESAPI interfaces are otherwise left intact.

For example: <todo: replace PHP with Java>
```
...
require_once dirname(__FILE__) . '/../Authenticator.php';
...
//your implementation
class MyAuthenticator implements Authenticator {
...
```
Developers would call ESAPI in this example as follows:
```
...
$ESAPI = new ESAPI();
$myauthenticator = new MyAuthenticator();
//register with locator class
ESAPI::setAuthenticator($myauthenticator);
$authenticator = ESAPI::getAuthenticator();
$authenticator->login(...); //use your implementation
...
```
The UML for the above example is in the figure below.

Figure 2: Built‐In Singleton Pattern Example 2 ESAPI Design Patterns
<todo: picture>

Pros of taking this approach include loose coupling between ESAPI and your own implementations.

Cons include the need for developers to understand how to call ESAPI functions with the parameters required by your organization and/or application.