package com.adactin.stepdefinition;

import com.adactin.pom.Bookeditenary;
import com.adactin.pom.Bookeditenaryconfirmation;
import com.adactin.pom.Confirmationpage;
import com.adactin.pom.Display;
import com.adactin.pom.Location;
import com.adactin.pom.Login;
import com.adactin.pom.Selecthotel;
import com.adactin.utils.Singleton;
import com.baseclass.adactin.Baseadactin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Adactin extends Baseadactin{
	public static Login lo;
	public static Location lc;
	public static Display ds;
	public static Confirmationpage cf;
	public static  Bookeditenary  bc;
	public static Selecthotel sh;
	public static Bookeditenaryconfirmation bic;
	Singleton sp= new Singleton();
		









				@Given("User login the application")
				public void user_login__application() {
				    
					lo=new Login();
					lc=new Location();
			        ds= new Display();
			        cf=new Confirmationpage();
			        bc= new Bookeditenary();
			        sh=new Selecthotel();
			        bic=new Bookeditenaryconfirmation();
					
				}



				@Then("verify user should  enter {string} in specific textbox")
				public void verify_user_should_enter_in_specific_textbox(String string) {
					  sendkeys(sp.getLo().getUsername(),string);
				   
				}
				@Then("Verify user shoud enter {string} in textbox")
				public void verify_user_shoud_enter_in_textbox(String string) {
				    
					clickOnElement(sp.getLo().getPw());
					sendkeys(sp.getLo().getPw(),string);
				}
				@Then("click on the login biutton")
				public void click_on_the_login_biutton() {
				    
					clickOnElement(sp.getLo().getLogin());  
				}
				@When("click into new page")
				public void click_into_new_page() {
				    
				   
				}


							
															

					@Then("User should Select location")
					public void user_should_Select_location() {
						select(lc.getLocation(),"Sydney");
						String location = lc.getLocation().getAttribute("value");	
						System.out.println(location);
						Assert.assertEquals("Sydney", location);
						if(true) {
							System.out.println("location displayed");
					    
					}

					}

					@Then("user should select the hotelname")
					public void user_should_select_the_hotelname() {
						select(lc.getHotels(),"Hotel Creek");
						  
					    
					}
					@Then("User should enable to select type of room")
					public void user_should_enable_to_select_type_of_room() {
					    
						select(lc.getRoomtype(),"Double");
						  
					}
					@Then("User should enable to select no of rooms")
					public void user_should_enable_to_select_no_of_rooms() {
					    
						select(lc.getNoofroom(),"1");
					}
					@Then("user should entered check in date more than that check in")
					public void user_should_entered_check_in_date_more_than_that_check_in() {
						sendkeys(lc.getCheckindate(),"20/06/2020");
					    
					}
					@Then("user should to type check out date")
					public void user_should_to_type_check_out_date() {
						sendkeys(lc.getCheckoutdate(),"12/06/2020");
					    
					}
					@Then("user should enable to select no of room from  options for adult and for children also")
					public void user_should_enable_to_select_no_of_room_from_options_for_adult_and_for_children_also() {
						select(lc.getAdultroom(),"1");
						select(lc.getChildroom(),"1");
					    
					}
					@Then("user should enable for clicking search button other wise user enable to reset their data also")
					public void user_should_enable_for_clicking_search_button_other_wise_user_enable_to_reset_their_data_also() {
					    
						clickOnElement(lc.getSearchbutton());
					}
					@When("user should visible an error message")
					public void user_should_visible_an_error_message() {
					   
					    
					}





												

						@Then("user should entered check in date")
						public void user_should_entered_check_in_date() {
							sendkeys(lc.getCheckindate(),"12/06/2020");
					
						}



						@Then("user should enable to type check out date")
						public void user_should_enable_to_type_check_out_date() {
							sendkeys(lc.getCheckoutdate(),"16/06/2020");
					
						}
						@When("user should entered into new page displaying all data")
						public void user_should_entered_into_new_page_displaying_all_data() {
						    
					
						}


								
												

							@Then("usher should compare the location which is selected same as that of location in page of in search of hotel")
							public void usher_should_compare_the_location_which_is_selected_same_as_that_of_location_in_page_of_in_search_of_hotel() {
					
								  
								String loca = sh.getLocation().getAttribute("value");
								System.out.println(loca);
								Assert.assertEquals("Sydney", loca );
									
								if(true) {
									System.out.println("location displayed correctly");
								}
							
								}
							



							@Then("user should compare checkin date")
							public void user_should_compare_checkin_date() {
								String adate = sh.getArrivaldate().getAttribute("value");
								System.out.println(adate);
								
								Assert.assertEquals("12/06/2020",adate);
									
								if(true) {
									System.out.println("checkindate displayed correctly");
								}
						
							}
							@Then("user should compare checkout date")
							public void user_should_compare_checkout_date() {
					
								String ddate = sh.getDepdate().getAttribute("value");
								System.out.println(ddate);
								
								Assert.assertEquals("16/06/2020",ddate);
									
								if(true) {
									System.out.println("checckoutdate displayed correctly");
								}
								
							
							}
							@Then("user should compare no of rooms selected as same")
							public void user_should_compare_no_of_rooms_selected_as_same() {
								String room = sh.getRoom().getAttribute("value");
								System.out.println(room);
								
								Assert.assertEquals("1 Rooms",room);
									
								if(true) {
									System.out.println("no of room displayed correctly");
								}
							
						
							}
							@Then("user should compare roomtype as same as you selected")
							public void user_should_compare_roomtype_as_same_as_you_selected() {
					
								String roomtype = sh.getRoomtype().getAttribute("value");
								System.out.println(roomtype);
								
								Assert.assertEquals("Double",roomtype);
									
								if(true) {
									System.out.println("roomtype displayed correctly");
								}
							
							}
							@Then("user should compare price which is calculated same as formula")
							public void user_should_compare_price_which_is_calculated_same_as_formula() {
					
								  
							}
							@When("user should entered all data  correctly")
							public void user_should_entered_all_data_correctly() {
					
						
							}


								

								@Then("To verify cancel the ordernumberlink")
								public void to_verify_cancel_the_ordernumberlink() {
								   
								   
								}



								@Then("click on cancel button")
								public void click_on_cancel_button() {
									clickOnElement(ds.getCancelbutton());	
								   
								}
								@When("cancelled order and get back to homepage")
								public void cancelled_order_and_get_back_to_homepage() {
								   
								   
								}



								
								
								
								
								
								
								
								


										@Then("User should  verify all displayed data")
										public void user_should_verify_all_displayed_data() {
										
										    
										}



										@Then("User should to apply log out button")
										public void user_should_to_apply_log_out_button() {
										
											clickOnElement(ds.getLogoutbutton()); 
										}
										@When("User should logs out from application")
										public void user_should_logs_out_from_application() {
										
										    
										}




									
									
										
										
										
										
										
										
										
										
										
										
										

											@Then("User should verify all displayed data")
											public void user_should_verify__displayed_data() {
											    
											   
											}



											@Then("User should click on select option")
											public void user_should_click_on_select_option() {
											    
												clickOnElement(ds.getRadiobutton());
											}
											@Then("User should click on continue button")
											public void user_should_click_on_continue_button() {
											    
												clickOnElement(ds.getContinuebutton());
											}
											@Then("User should entering into confirmation page")
											public void user_should_entering_into_confirmation_page() {
											    
											   
											}
											@Then("User should entering firstname in the textbox")
											public void user_should_entering_firstname_in_the_textbox() {
												sendkeys(cf.getFname(),"JULY");
											   
											}
											@Then("User should  entering lastname in the specific textbox")
											public void user_should_entering_lastname_in_the_specific_textbox() {
											    
												sendkeys(cf.getLname(),"JOSEPH");
											}
											@Then("User should entering billing address entering in textbox")
											public void user_should_entering_billing_address_entering_in_textbox() {
												sendkeys(cf.getBillingadd(),"chittilappillyhouse,p.o.anjurmundur,trichur,kerala");
											   
											}
											@Then("User should entering creditcard number")
											public void user_should_entering_creditcard_number() {
												sendkeys(cf.getCreditcard(),"4852625985233147");
											   
											}
											@Then("User should entering credit card type")
											public void user_should_entering_credit_card_type() {
												select(cf.getCardtype(),"VISA");
											   
											}
											@Then("User should entering creditcard expiringdetails")
											public void user_should_entering_creditcard_expiringdetails() {
												  select(cf.getCardexxpire(),"5");
												   select(cf.getCardexxpireyear(),"2022");
											   
											}

												@Then("User should entered cvv number")
												public void user_should_entered_cvv_number() {
													sendkeys(cf.getCvvnumber(),"485");
													clickOnElement(cf.getBooknow());
												}

											@When("User should recieve ordernumber")
											public void user_should_recieve_ordernumber() {
											    
											   
											}





											@Then("User should click on the booked itenary button")
											public void user_should_click_on_the_booked_itenary_button() {
											  
												clickOnElement(bic.getBookedbutton());
											}



											@When("User should see booked itenary page")
											public void user_should_see_booked_itenary_page() {
											  
											    
											}
											
											
											
											
											

												@Then("Usr should verify firstname compare with confirmation page")
												public void usr_should_verify_firstname_compare_with_confirmation_page() {
													 String firstname = bic.getLfirstname().getAttribute("value");
													    System.out.println("in booked itenary page");
														Assert.assertEquals("july", firstname );
															
														if(true) {
															System.out.println("firstname displayed correctly");
														}
													
												    
												}



												@Then("User should verify lastname compare with confirmation page")
												public void user_should_verify_lastname_compare_with_confirmation_page() {
												    
												    
												}
												@Then("User should verify roomtype compare with confirmation page")
												public void user_should_verify_roomtype_compare_with_confirmation_page() {
													String room = bic.getLrooms().getAttribute("value");
													System.out.println("in booked itenary page");
													//System.out.println(orderid);
													Assert.assertEquals("1 Rooms", room );
														
													if(true) {
														System.out.println("room displayed correctly");
													}  
												    
												}
												@Then("User should verify roomnumber compare with confirmation page")
												public void user_should_verify_roomnumber_compare_with_confirmation_page() {
												    
													String roomtype = bic.getLroomtype().getAttribute("value");
													//System.out.println(orderid);
													System.out.println("in booked itenary page");
													Assert.assertEquals("Double", roomtype );
														
													if(true) {
														System.out.println("roomtype displayed correctly");
													}
												
												}
												@Then("User should verify price compare with formula price= price per night*no of days*no of rooms")
												public void user_should_verify_price_compare_with_formula_price_price_per_night_no_of_days_no_of_rooms() {
													String price = bic.getLprice().getAttribute("value");
													//System.out.println(orderid);
													System.out.println("in booked itenary page");
													Assert.assertEquals("AUD $ 1001", price );
														
													if(true) {
														System.out.println("price displayed correctly");
													}
												    
												}






														@Then("User should entering search order id")
														public void user_should_entering_search_order_id() {
															sendkeys(bic.getLsearchid(),"O388J3T1TC");
														    
														}



														@Then("User should  click on go button")
														public void user_should_click_on_go_button() {
															clickOnElement(bic.getLgo());
														    
														}
														@When("User should  display relevant details")
														public void user_should_display_relevant_details() {
														    
														    
														}



}
