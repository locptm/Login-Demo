#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Login to system
to do something
as an user
i would like to login to system

@tag1

Scenario: Login to system fail with invalid email and valid password
Given User go to page http://phbc.ais.vn/
And Enter invalid email is "locptm1" and valid password is "123456"
When User click submit button
Then page show message "TÀI KHOẢN HOẶC MẬT KHẨU KHÔNG ĐÚNG"

Scenario: Login to system fail with valid email and invalid password
Given User go to page http://phbc.ais.vn/
And Enter valid email is "locptm" and valid password is "1234567"
When User click submit button
Then page show message "TÀI KHOẢN HOẶC MẬT KHẨU KHÔNG ĐÚNG"

Scenario: Login to system sucsessfully with valid email and valid password
Given User go to page http://phbc.ais.vn/
And Enter valid email is "locptm" and valid password is "123456"
When User click submit button
Then direct to home page title "Danh sách Người dùng - VNPOST PHBC"