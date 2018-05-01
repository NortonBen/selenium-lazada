Feature: Login

Scenario: login error with email password is null
  Given I open page "login"
  When I click on button "login"
  Then I have element span "msg_email" show message as "Bạn không thể bỏ trống chỗ này"
  Then I have element span "msg_password" show message as "Bạn không thể bỏ trống chỗ này"

Scenario: login error with email not validate minimum
  Given I open page "login"
  And I Enter text "fgf" to input "email"
  When I click on button "login"
  Then I have element span "msg_email" show message as "Độ dài của email phải từ 6-60 kí tự."

Scenario: login error with email not validate maximum
  Given I open page "login"
  And I Enter text "dscfhffffffffffffffffffffffffffffffffffffffffffftgretrgrfsddsfds" to input "email"
  When I click on button "login"
  Then I have element span "msg_email" show message as "Độ dài của email phải từ 6-60 kí tự."

Scenario: login error with email not validate fomat email
  Given I open page "login"
  And I Enter text "dscrgrfsddsfds" to input "email"
  When I click on button "login"
  Then I have element span "msg_email" show message as "Email bạn nhập không phải là email hợp lệ"


Scenario: clear email with
  Given I open page "login"
  And I Enter text "nguyendinhb@gmail.com" to input "email"
  And I Enter text "nguyen" to input "password"
  When I click on button "clear_input_email"
  Then I have element input "email" show message as ""


Scenario: clear pasword with
  Given I open page "login"
  And I Enter text "nguyendinhb@gmail.com" to input "email"
  And I Enter text "nguyen" to input "password"
  When I click on button "clear_input_password"
  And I have element input "password" show message as ""

Scenario: show pasword
  Given I open page "login"
  And I Enter text "nguyendinhb@gmail.com" to input "email"
  And I Enter text "nguyen" to input "password"
  When I click on button "show_input_password"
  Then I have element input "password_as_text" as "nguyen"

Scenario: login error with email or password fail
  Given I open page "login"
  And I Enter text "nguyendinhb@gmail.com" to input "email"
  And I Enter text "nguyen" to input "password"
  When I click on button "login"
  Then I wait for 2 sec
  And I have element div "feedback_content" show message as "Tên đăng nhập hoặc mật khẩu không chính xác."

