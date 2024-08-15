@Swaglabs
Feature: Login Page Feature
  @checkComponents
  Scenario: Check Components
    Given user is on Login Page
    Then should see Logo
    Then should see Icon
    Then should see usernameBox "Username"
    Then should see passwordBox "Password"
    Then should see Login Button "LOGIN"

  @LoginPositive
  Scenario: Happy Path
    Given user is on Login Page
    When sendkeys username "standard_user"
    When sendkeys password "secret_sauce"
    When click Login Button
    Then should see Home Page

  @LoginNegative
  Scenario: Invalid Username
    Given user is on Login Page
    When sendkeys username "sttandarduser"
    When sendkeys password "secret_sauce"
    When click Login Button
    Then should see Error Message Genel "Username and password do not match any user in this service."

  @LoginNegative
  Scenario: Invalid Password
    Given user is on Login Page
    When sendkeys username "standard_user"
    When sendkeys password "secretsauce"
    When click Login Button
    Then should see Error Message Genel "Username and password do not match any user in this service."

  @LoginNegative
  Scenario: Both Invalid
    Given user is on Login Page
    When sendkeys username "sttandarduser"
    When sendkeys password "secretsauce"
    When click Login Button
    Then should see Error Message Genel "Username and password do not match any user in this service."

  @LoginNegative
  Scenario: Empty UsernameBox
    Given user is on Login Page
    When sendkeys password "secret_sauce"
    When click Login Button
    Then should see Username Error Message "Username is required"

  @LoginNegative
  Scenario: Empty PasswordBox
    Given user is on Login Page
    When sendkeys username "standard_user"
    When click Login Button
    Then should see Password Error Message "Password is required"

  @LoginNegative
  Scenario: Empty Credentials
    Given user is on Login Page
    When click Login Button
    Then should see Username Error Message "Username is required"