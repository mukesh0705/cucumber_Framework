Feature:
Validate Supplier Addition in Stock Accounting
Scenario Outline:
Given user launch url "http://webapp.qedgetech.com/login.php" in Browser
When user Enter userName "admin" and passWord "master"
And user click login button,Add new record?,Add succeeded
When user click on supplier button
When user click on AddSupplier button
And user Enter Supplier Name"<supplierName>"
And user Enter Address "<Address>"
And user Enter City "<City>"
And user Enter Country "<Country>"
And user Enter Contact Person "<ContactPerson>"
And user Enter Phone Number "<PhoneNumber>"
And user Enter Email "<Email>"
And user Enter Mobile Number "<MobileNumber>"
And user Enter Notes "<Notes>"
And user Click on Add button
When user Move to Aleart Window and accept
When user Move to Aleart Window and accept
When user verify suppilier Addition
Then close Browser
Examples:
|supplierName|Address|City|Country|ContactPerson|PhoneNumber|Email|MobileNumber|Notes|

|Manish Kumar|Hyderabad|Hyderbad|India|Ranga Reddy|7714524521|manish123@gmail.com|7714524521|Done|

|Manish Kumar|Hyderabad|Hyderbad|India|Ranga Reddy|7714524521|manish123@gmail.com|7714524521|Done|

