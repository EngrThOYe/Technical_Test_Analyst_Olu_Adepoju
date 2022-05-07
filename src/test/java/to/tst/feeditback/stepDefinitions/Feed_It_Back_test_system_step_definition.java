package to.tst.feeditback.stepDefinitions;

import com.sun.jndi.cosnaming.IiopUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import to.tst.feeditback.pages.*;

public class Feed_It_Back_test_system_step_definition extends BasePage {

    HomePage homePage = new HomePage(driver);
    SearchForVenuePage searchForVenuePage = new SearchForVenuePage(driver);
    WhenDidYouVisitPage whenDidYouVisitPage = new WhenDidYouVisitPage(driver);
    QuestionAndRatingPage questionAndRatingPage = new QuestionAndRatingPage(driver);

    @Given("I navigate to Menu Insight Question page")
    public void i_navigate_to_menu_insight_question_page() {

    }

    @When("I click on textbox Search for a dish here")
    public void i_click_on_textbox_search_for_a_dish_here() {

    }

    @When("I enter valid dish name as {string}")
    public void i_enter_valid_dish_name_as(String string) {

    }

    @When("the dish name is displayed")
    public void the_dish_name_is_displayed() {

    }

    @When("I click on the dish name")
    public void i_click_on_the_dish_name() {

    }

    @When("I click on bad smiles")
    public void i_click_on_bad_smiles() {

    }

    @When("Why didnt you like it? question is displayed")
    public void why_didnt_you_like_it_question_is_displayed() {

    }

    @When("I select an answer to Why didnt you like it? as {string}")
    public void i_select_an_answer_to_why_didnt_you_like_it_as(String string) {



    }

    @Then("Other Multiline or Single Line Question page is displayed")
    public void other_multiline_or_single_line_question_page_is_displayed() {


    }

    @When("I click on Course type as {string}")
    public void i_click_on_course_type_as(String string) {

    }

    @When("I select the menu type as {string}")
    public void i_select_the_menu_type_as(String string) {

    }

    @When("I select the Dish name as {string}")
    public void i_select_the_dish_name_as(String string) {

    }

    @Then("the dish name page is displayed")
    public void the_dish_name_page_is_displayed() {

    }

    @Given("I navigate to dish name page")
    public void i_navigate_to_dish_name_page() {

    }

    @Given("I click on Neutral smiles")
    public void i_click_on_neutral_smiles() {

    }

    @Given("Add your comments textbox is displayed")
    public void add_your_comments_textbox_is_displayed() {

    }

    @Given("I select Add your comments textbox")
    public void i_select_add_your_comments_textbox() {

    }

    @Given("I enter comments as {string}")
    public void i_enter_comments_as(String string) {

    }

    @Given("I click the Done button")
    public void i_click_the_done_button() {

    }

    @Given("the Courses page is displayed")
    public void the_courses_page_is_displayed() {

    }

    @Given("I click the Save & Continue button")
    public void i_click_the_save_continue_button() {

    }

    @Given("the Menu Insight Question page is displayed")
    public void the_menu_insight_question_page_is_displayed() {

    }

    @Given("I click the next arrow button")
    public void i_click_the_next_arrow_button() {


    }

    @Given("I click on Good smiles")
    public void i_click_on_good_smiles() {
;
    }

    @Given("What did you like about it? question is displayed")
    public void what_did_you_like_about_it_question_is_displayed() {

    }

    @Given("I select an answer to What did you like about it? as {string}")
    public void i_select_an_answer_to_what_did_you_like_about_it_as(String string) {

    }

    @Given("I navigate to Other Single Line Question page")
    public void i_navigate_to_other_single_line_question_page() {

    }

    @When("I click on textbox Enter your text here")
    public void i_click_on_textbox_enter_your_text_here() {

    }

    @When("I enter the single line answer as {string}")
    public void i_enter_the_single_line_answer_as(String string) {

    }

    @Then("Other Multiline Question or applaud a member of our team or checkout \\(Thanks for your feedback or Sorry to hear that) page is displayed")
    public void other_multiline_question_or_applaud_a_member_of_our_team_or_checkout_thanks_for_your_feedback_or_sorry_to_hear_that_page_is_displayed() {

    }

    @Given("I navigate to Other Multiline Question page")
    public void i_navigate_to_other_multiline_question_page() {

    }

    @When("I click on textbox Add your comments")
    public void i_click_on_textbox_add_your_comments() {

    }

    @When("I enter the multiline answer as {string}")
    public void i_enter_the_multiline_answer_as(String string) {

    }

    @Then("Other Single Line Question or applaud a member of our team or checkout page is displayed")
    public void other_single_line_question_or_applaud_a_member_of_our_team_or_checkout_page_is_displayed() {

    }

    @Given("I navigate to feeditback test homepage")
    public void i_navigate_to_feeditback_test_homepage() throws InterruptedException {
        NavigateToHomePage();
        Thread.sleep(2000);

    }

    @Given("I click on textbox Enter your feedback code")
    public void i_click_on_textbox_enter_your_feedback_code() {

    }

    @Given("I enter feedback code as {string}")
    public void i_enter_feedback_code_as(String string) {

    }

    @When("I click on Next button")
    public void i_click_on_next_button() {

    }

    @Then("I should see an error message An invalid PIN was supplied")
    public void i_should_see_an_error_message_an_invalid_pin_was_supplied() {

    }

    @Then("Search for venue page is displayed")
    public void search_for_venue_page_is_displayed() {

    }

    @Then("the Next button should not be responsive")
    public void the_next_button_should_not_be_responsive() {

    }

    @When("I click on Not got a code")
    public void i_click_on_not_got_a_code() {
        searchForVenuePage = homePage.click_on_not_got_a_code();

    }

    @Given("I navigate to How would you rate us page")
    public void i_navigate_to_how_would_you_rate_us_page() {

    }

    @When("I select Food rating as {string}")
    public void i_select_food_rating_as(String Food_Rating) {
        questionAndRatingPage.selectFoodRatingAs(Food_Rating);

    }

    @When("I select Drink rating as {string}")
    public void i_select_drink_rating_as(String Drink_Rating) {
        questionAndRatingPage.selectDrinkRatingAs(Drink_Rating);


    }

    @When("How likely are you to recommend us to your friends and family? page is displayed")
    public void how_likely_are_you_to_recommend_us_to_your_friends_and_family_page_is_displayed() {

    }

    @When("I select slider for How likely are you to recommend us to your friends and family? as {string}")
    public void i_select_slider_for_how_likely_are_you_to_recommend_us_to_your_friends_and_family_as(String string) {

    }

    @When("Drill Down Plus Question: What was wrong with your Food? page is displayed")
    public void drill_down_plus_question_what_was_wrong_with_your_food_page_is_displayed() {

    }

    @When("I select an answer to Drill Down Plus Question as {string}")
    public void i_select_an_answer_to_drill_down_plus_question_as(String string) {

    }

    @Then("Menu Insight Question page is displayed")
    public void menu_insight_question_page_is_displayed() {

    }

    @When("I click on Platform privacy notice")
    public void i_click_on_platform_privacy_notice() {

    }

    @Then("Platform privacy notice page is displayed")
    public void platform_privacy_notice_page_is_displayed() {

    }

    @Given("I navigate to Search for venue page")
    public void i_navigate_to_search_for_venue_page() {

    }

    @When("I click on Venues near me button")
    public void i_click_on_venues_near_me_button() {

    }

    @Then("list of venues near me is displayed")
    public void list_of_venues_near_me_is_displayed() {

    }

    @When("I click on textbox Enter location")
    public void i_click_on_textbox_enter_location() {
        searchForVenuePage.clickOntextboxEnterLocation();


    }

    @When("I enter location as {string}")
    public void i_enter_location_as(String Address) {
        searchForVenuePage.EnterLocationAsAddress(Address);

    }

    @Then("the venue is displayed")
    public void the_venue_is_displayed() {

    }

    @Then("I click on the venue")
    public void i_click_on_the_venue() {
        whenDidYouVisitPage = searchForVenuePage.clickOnTheVenue();


    }

    @Then("When did you visit page is displayed")
    public void when_did_you_visit_page_is_displayed() {

    }

    @Given("I navigate to When did you visit page")
    public void i_navigate_to_when_did_you_visit_page() {

    }
    
    @When("I select Hour as {string}")
    public void i_select_hour_as(String string) {


    }

    @When("I select Min as {string}")
    public void i_select_min_as(String string) {

    }

    @When("I select am or pm as {string}")
    public void i_select_am_pm_as(String string) {

    }

    @Then("the date and time is displayed")
    public void the_date_and_time_is_displayed() {

    }

    @Then("I click on start button")
    public void i_click_on_start_button() {
    questionAndRatingPage = whenDidYouVisitPage.clickOnStartButton();

    }

    @Then("How would you rate us page is displayed")
    public void how_would_you_rate_us_page_is_displayed() {

    }

    @When("I click on choose calender button")
    public void i_click_on_choose_calender_button() {

    }

    @When("I select month as {string}")
    public void i_select_month_as(String string) {

    }

    @When("I select valid date as {string}")
    public void i_select_valid_date_as(String string) {

    }

    @Given("I navigate to applaud a member of our team page")
    public void i_navigate_to_applaud_a_member_of_our_team_page() {

    }

    @When("I click on textbox Search for a team member by their name")
    public void i_click_on_textbox_search_for_a_team_member_by_their_name() {

    }

    @When("I enter a valid team member name as {string}")
    public void i_enter_a_valid_team_member_name_as(String string) {

    }

    @Then("checkout page is displayed")
    public void checkout_page_is_displayed() {

    }

    @When("I select a team member name or image as {string}")
    public void i_select_a_team_member_name_or_image_as(String string) {

    }

    @Given("I navigate to Sorry to hear that checkout page")
    public void i_navigate_to_sorry_to_hear_that_checkout_page() {

    }

    @When("I click on textbox Email address")
    public void i_click_on_textbox_email_address() {

    }

    @When("I enter a valid Email address as {string}")
    public void i_enter_a_valid_email_address_as(String string) {

    }

    @When("I click on textbox Title")
    public void i_click_on_textbox_title() {

    }

    @When("I enter a valid Title as {string}")
    public void i_enter_a_valid_title_as(String string) {

    }

    @When("I click on textbox First name")
    public void i_click_on_textbox_first_name() {

    }

    @When("I enter a valid First name as {string}")
    public void i_enter_a_valid_first_name_as(String string) {

    }

    @When("I click on textbox Last name")
    public void i_click_on_textbox_last_name() {

    }

    @When("I enter a valid Last name as {string}")
    public void i_enter_a_valid_last_name_as(String string) {

    }

    @When("I click on textbox Postcode")
    public void i_click_on_textbox_postcode() {

    }

    @When("I enter a valid Postcode as {string}")
    public void i_enter_a_valid_postcode_as(String string) {

    }

    @When("I click on textbox Mobile phone")
    public void i_click_on_textbox_mobile_phone() {

    }

    @When("I enter a valid Mobile phone as {string}")
    public void i_enter_a_valid_mobile_phone_as(String string) {

    }

    @When("I click on textbox Full Address")
    public void i_click_on_textbox_full_address() {

    }

    @When("I enter a valid Full Address as {string}")
    public void i_enter_a_valid_full_address_as(String string) {

    }

    @When("I select check box for Claim my voucher: instant")
    public void i_select_check_box_for_claim_my_voucher_instant() {

    }

    @When("I select check box for Sign up to our newsletter for news and offers")
    public void i_select_check_box_for_sign_up_to_our_newsletter_for_news_and_offers() {

    }

    @When("I enter a valid Date of birth as {string}")
    public void i_enter_a_valid_date_of_birth_as(String string) {

    }

    @When("I enter a valid Birthday as {string}")
    public void i_enter_a_valid_birthday_as(String string) {

    }

    @When("I click the Finish button")
    public void i_click_the_finish_button() {

    }

    @Then("Thank you for your valuable feedback page is displayed")
    public void thank_you_for_your_valuable_feedback_page_is_displayed() {

    }

    @Given("I navigate to Thanks for your feedback checkout page")
    public void i_navigate_to_thanks_for_your_feedback_checkout_page() {
;
    }

    @When("I click on textbox Email")
    public void i_click_on_textbox_email() {

    }

    @When("I enter a valid Email as {string}")
    public void i_enter_a_valid_email_as(String string) {

    }

    @When("I select check box for I accept the privacy policy")
    public void i_select_check_box_for_i_accept_the_privacy_policy() {

    }

    @Given("I navigate to checkout Thanks for your feedback or Sorry to hear that page")
    public void i_navigate_to_checkout_thanks_for_your_feedback_or_sorry_to_hear_that_page() {

    }

    @When("I click on No thanks")
    public void i_click_on_no_thanks() {

    }

    @When("I click on day of visit as today")
    public void iClickOnDayOfVisitAsToday() {
        whenDidYouVisitPage.clickOnDayOfVisitAsToday();
        
    }

    @When("I click on day of visit as yesterday")
    public void iClickOnDayOfVisitAsYesterday() {
    }

    @And("I click on drop hour selector")
    public void iClickOnDropHourSelector() throws InterruptedException {
        whenDidYouVisitPage.clickOnDropHourSelector();

    }

    @And("I click on drop Min selector")
    public void iClickOnDropMinSelector() {
        whenDidYouVisitPage.clickOnDropMinSelector();
        
    }

    @And("I click on drop am or pm selector")
    public void iClickOnDropAmOrPmSelector() {
        whenDidYouVisitPage.clickOnDropAmOrPmSelector();
    }

    @And("I select the active hour")
    public void iSelectTheActiveHour() {
        whenDidYouVisitPage.selectactivehour();
    }

    @And("I select the active min")
    public void iSelectTheActiveMin() {
        whenDidYouVisitPage.selectactivemin();
    }

    @And("I select the active am or pm")
    public void iSelectTheActiveAmOrPm() {
        whenDidYouVisitPage.selectactiveamorpm();
    }

    @Then("the food and drink rating are selected")
    public void theFoodAndDrinkRatingAreSelected() {
    }
}
