Feature: Testing HRM login

	Scenario: Login with valid data
	
		Given site address as hrm page
		When user enter valid username as "Admin"
		And user enter valid password as "admin123"
		And user click on login button
		Then Verify Admin tab displayed
		And logout from HRM Application