//spelling 468, 490, 540, 729, 731, 856, 880, 892, 897, 922, 926, 1466, 1477, 1748
//Sam Rhodes is awesome
//3-10-16
//Wizard OF Oz
//i got help from

//importing Scanner
import java.util.Scanner;

//create class
public class WizardOfOz
{


    //creating main method
    public static void main (String [] args)
        {
            //creating variables :)
            double userAnswer;
            final double CHOICE1 = 1;
            final double CHOICE2 = 2;
            final double CHOICE3 = 3;
            final double CHOICE4 = 4;
            final double CHOICE5 = 5;
            final double CHOICE6 = 6;
            final double CHOICE7 = 7;
            final double CHOICE8 = 8;
            final double CHOICE9 = 9;
            final double CHOICE10 = 10;
            final double CHOICE11 = 11;
            final double CHOICE12 = 12;
            final double CHOICE13 = 13;
            final double CHOICE14 = 14;
            final double CHOICE15 = 15;
            final double CHOICE16 = 16;
            final double CHOICE17 = 17;
            final double CHOICE18 = 18;
            final double CHOICE19 = 19;
            final double CHOICE20 = 20;
            final double CHOICE21 = 21;
            final double CHOICE22 = 22;
            final double CHOICE23 = 23;
            final double CHOICE24 = 24;
            final double CHOICE25 = 25;
            final double CHOICE26 = 26;
            final double CHOICE27 = 27;
            final double CHOICE28 = 28;
            final double CHOICE29 = 29;
            final double CHOICE30 = 30;
            final double CHOICE31 = 31;
            final double CHOICE32 = 32;
            final double CHOICE33 = 33;
            final double CHOICE34 = 34;
            final double CHOICE35 = 35;
            final double CHOICE36 = 36;
            final double CHOICE37 = 37;
            final double CHOICE38 = 38;
            final double CHOICE39 = 39;
            final double CHOICE40 = 40;
            final double CHOICE41 = 41;
            final double CHOICE42 = 42;
            final double CHOICE43 = 43;
            final double CHOICE44 = 44;
            final double CHOICE45 = 45;
            final double CHOICE46 = 46;
            final double CHOICE47 = 47;
            final double CHOICE48 = 48;
            final double CHOICE49 = 49;
            final double CHOICE50 = 50;
            final double CHOICE51 = 51;
            final double CHOICE52 = 52;
            final double CHOICE53 = 53;
            final double CHOICE54 = 54;
            final double CHOICE55 = 55;
            final double CHOICE56 = 56;
            final double CHOICE57 = 57;
            final double CHOICE58 = 58;
            final double CHOICE59 = 59;
            final double CHOICE60 = 60;
            final double CHOICE61 = 61;
            final double CHOICE62 = 62;
            final double CHOICE63 = 63;
            final double CHOICE64 = 64;
            String userName;
			String prompt1;
            String prompt2;
            String prompt3;
            String prompt4;
            String prompt5;
            String prompt6;
            String prompt7;
            String prompt8;
            String prompt9;
            String prompt10;
            String prompt11;
            String prompt12;
            String prompt13;
            String prompt14;
            String prompt15;
            String prompt16;
            String prompt17;
            String prompt18;
            String prompt19;
            String prompt20;
            String prompt21;
            String prompt22;
            String prompt23;
            String prompt24;
            String prompt25;
            String prompt26;
            String prompt27;
            String prompt28;
            String prompt29;
            String prompt30;
            String prompt31;
            String prompt32;
            String prompt33;
            String prompt34;
            String prompt35;
            String prompt36;
            String prompt37;
            String prompt38;
            String prompt39;
            String prompt40;
            String prompt41;
            String prompt42;
            String prompt43;
            String prompt44;
            String prompt45;
            String prompt46;
            String prompt47;
            String prompt48;
            String prompt49;
            String prompt50;
            String prompt51;
            String prompt52;
            String prompt53;
            String prompt54;
            String prompt55;
            String prompt56;
            String prompt57;
            String prompt58;
            String prompt59;
            String prompt60;
            String prompt61;
            String prompt62;
            String prompt63;
            String prompt64;

        //creating Scanner
        Scanner in = new Scanner(System.in);

        //REMINDER
        System.out.println("READ THE NUMBER CHOICES!");
		System.out.println("");

	   //user's name
       System.out.println("Please input your name :) \n");
       userName = in.next();
       System.out.println("");

       System.out.println("Hi " + userName + "! :) ");
       System.out.println("");


        //starting story line
        System.out.println("You are sitting in your classroom and you're very bored. You decide to go");
        System.out.println("on an adventure! You get up and start walking, you're now in the main hall,");
        System.out.println("but so is Dr. Steele! (Choice 1) You keep walking toward the front of the");
        System.out.println("school and risk the wrath of Steele, or (Choice 2) you turn around and go ");
        System.out.println("through the back of B hall.");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Type 1 if you choose choice 1, and type 2 if you choose 2. Which do you choose?");
        System.out.println("");
        userAnswer = in.nextDouble();


					//1
					//1, if
         			prompt1 =
				   	 "\n Brave choice! You face Dr. Steele, but Dr. Steele starts asking a lot of"
					+"\n questions, (Choice 1) You can either make up a lie, or (Choice 2) trick Steele"
					+"\n into going back to your classroom and then knock her out and lock her in"
					+"\n a cabinet."
					+"\n ---------------------------------------------------------------------------------"
					+"\n Type 1 for choice 1, or type 2 for choice 2. Which do you choose?";

					//2
					//1, else
					prompt2 =
				   	 "\n You choose to go through the back of B hall, when you walk outside, it's"
					+ "\n pouring!(Choice 1) Go back inside! What were you thinking going on an"
					+ "\n adventure in this weather? (Choice 2) Lol this is the perfect weather for an"
					+ "\n adventure, all great adventures happen in the rain!"
					+ "\n-------------------------------------------------------------------------------"
					+ "\n Type 3 for choice 1, type 4 for choice 2. Which do you choose?";


								//math for choice 1, #1
						        if (userAnswer == 1)
						         {
						        	System.out.println(prompt1);
									userAnswer = in.nextDouble();
						       	 }

								//math for choice 1, #2
							    else if (userAnswer == 2)
							    	  {
									System.out.println(prompt2);
									userAnswer = in.nextDouble();

							        }

							    else
							    	{
							        System.out.println("That wasn't a choice. Please choose another.");
							        userAnswer = in.nextDouble();
							        //return prompt1;
							        //return prompt2;
							    	}



							//1
							//1, if
							prompt1 =
						   	  "\n You choose to make up a lie, you tell Steele that your daughter just went"
			                + "\n into labor, and she needs someone to drive her to the hospital. Then you"
			                + "\n run away before Steele has any time to object. You run until you are safely"
			                + "\n in your car. (Choice 1) Pick a direction, and start driving. (Choice 2)"
			                + "\n Take a nap"
			                + "\n -------------------------------------------------------------------------------"
			                + "\n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
					        //1, else
							prompt2 =
						   	 "\n You knock Steele out and shove her in a cabinet. (Choice 1) You can raid her"
						   	+ "\n office and look for contraband, or (Choice 2) just forget about her and go on"
						   	+ "\n your trip."
						    + "\n -----------------------------------------------------------------------------"
					 		+ "\n Type 3 for choice 1, and type 4 for choice 2. Which do you choose?";

							//3
							//2, if
							prompt3 =
				   			 "\n You go back inside, but as you are walking in the door, someone calls your name."
				   	   	    + "\n You turn around and try to find the person calling your name. While you are"
					        + "\n looking for the person calling your name, you get hit by the door. You fall down,"
					        + "\n then stand up and continue looking for your person. You quit looking when you"
					        + "\n realize something strange, it's not raining anymore, there isn't a cloud in the"
					        + "\n whole sky! (Choice 1) call the local weather man and investigate, (Choice 2)"
					        + "\n ignore it, I mean it's Texas the weather is really bipolar."
					        + "\n --------------------------------------------------------------------------------"
					        + "\n Type 5 for choice 1, and type 6 for choice 2. Which do you choose?";

							//4
					        //2, else
							prompt4 =
				   			 "\n You keep walking through the rain and slip. You hit your head on the hard sidewalk."
					 	    +"\n You get up and feel your head for bleeding or anything that will cut your adventure"
					  	    +"\n short. You seem alright when you realize that it's no longer raining. There's not a"
					  	    +"\n cloud in the sky!(Choice 1) Go back inside, your adventure weather is gone. What's"
					  	    +"\n the point of an adventure? (Choice 2) Keep walking you can have an adventure in the"
					  	    +"\n sun."
					  	    +"\n -----------------------------------------------------------------------------------"
					  	    +"\n Type 7 for choice 1, and type 8 for choice 2. Which do you choose?";


									//math for choice 2, #1
								        if (userAnswer == 1)
								        	{
								        	System.out.println(prompt1);
											userAnswer = in.nextDouble();

								        }

									//math for choice 2, #2
									    else if (userAnswer == 2)
									    	{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

									        	}
									//math for choice 2, #3
										else if (userAnswer == 3)
											{
										System.out.println(prompt3);
										userAnswer = in.nextDouble();

												}

									//math for choice 2, #4
									else if (userAnswer == 4)
										{
										System.out.println(prompt4);
										userAnswer = in.nextDouble();

												}
									else
										{
										System.out.println("That wasn't a choice. Please choose another.");
										userAnswer = in.nextDouble();
											}



							//1
							//1, if
							prompt1 =
						   	  "\n You pick north, you are sitting at a red light when you see something"
			                + "\n out of the corner of your eye. There is something falling from the"
			                + "\n sky! You realize that it is coming right towards you. You try to move"
			                + "\n your car, but you can't! Your car literally will not move! The thing"
			                + "\n hits your car, and knocks you out. When you wake up, you and your car"
			                + "\n are flying through the sky! (Choice 1) Jump out of the car (Choice 2)"
			                + "\n stay inside."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
					        //1, else
							prompt2 =
						   	  "\n You take a nap. You are in your car napping when you hear someone"
						   	+ "\n knocking on your car window. You wake up and step out of the car."
						   	+ "\n at the window was another teacher who needed to borrow something."
						   	+ "\n while you are chatting, you get hit in the head by something."
						   	+ "\n You fall down, and when you get back up, you are seeing stars"
						   	+ "\n and everything is spinning. You are waiting for the ground to stop"
						   	+ "\n stop moving so much when you realize that the ground isn't going"
						   	+ "\n to stop shaking. Your car is bouncing up and down like a bouncy ball!"
						   	+ "\n (Choice 1) Run towards the woods. (Choice 2) Run towards the school."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

							//3
							//2, if
							prompt3 =
							  "\n When you raid Stele's office, you don't find anything. (Choice 1)"
							+ "\n destroy her office, it's way to clean in there! (Choice 2) get out"
							+ "\n before someone finds you."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 5 for choice 1, or type 6 for choice 2. Which do you choose?";

							//4
							//2, else
							prompt4 =
							  "\n As you are leaving your classroom to go on your adventure, you hear"
							+ "\n something behind you and see Steele climbing out of the cabinet."
							+ "\n you blink and she's on top of you. She knocks you out and then runs"
							+ "\n away. When you regain conciousness you are flying through the air."
							+ "\n On a carpet. You see students and teachers and furniture whiz past"
							+ "\n you. (Choice 1) try to ask someone what is going on (Choice 2) go "
							+ "\n with the flow man :) peace and love."
							+ "\n ----------------------------------------------------------------------"
							+ "\n Type 7 for choice 1, or type 8 for choice 2. Which do you choose?";

							//5
							//3, if
							prompt5 =
							  "\n When the local weather man picks up, all he says is the same thing:"
							+ "\n Follow the yellow brick road, follow the yellow brick road, follow"
							+ "\n the yellow brick road. You hang up and dismiss that experience as"
							+ "\n him just being weird. You go inside and when you shut the door, you"
							+ "\n hear someone scream behind you. You turn around and see an old woman"
							+ "\n with a green face and a pointed hat suck half way in and half way"
							+ "\n out the door. (Choice 1) try to help her, (Choice 2) walk away."
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 9 for choice 1, or type 10 for choice 2. Which do you choose?";

							//6
							//3, else
							prompt6 =
							  "\n When you go inside, you notice something else strange. The walls are"
							+ "\n pink and the floors are yellow. There is a lady in a terrifiying large"
							+ "\n dress. She keeps asking you if you are a good teacher or a bad teacher."
							+ "\n You keep replying with I'm just a teacher! She says the students want"
							+ "\n to know if you are a good teacher or a bad teacher. You ask her what"
							+ "\n students? My students? She laughs and says of course not! She tells"
							+ "\n them to come out and the start pouring out of classrooms and broom"
							+ "\n closets. They have things on their heads from stacks of books to pencils"
							+ "\n and pens. (Choice 1) sing a song (Choice 2) throw them out of your way"
							+ "\n and go back to your class room."
							+ "\n ------------------------------------------------------------------------"
							+ "\n Type 11 for choice 1, or type 12 for choice 2. Which do you choose?";

							//7
							//4, if
							prompt7 =
							  "\n When you go inside, you notice something strange. The walls are"
							+ "\n pink and the floors are yellow. There is a lady in a terrifiying large"
							+ "\n dress. She keeps asking you if you are a good teacher or a bad teacher."
							+ "\n You keep replying with I'm just a teacher! She says the students want"
							+ "\n to know if you are a good teacher or a bad teacher. You ask her what"
							+ "\n students? My students? She laughs and says of course not! She tells"
							+ "\n them to come out and the start pouring out of classrooms and broom"
							+ "\n closets. They have things on their heads from stacks of books to pencils"
							+ "\n and pens. (Choice 1) sing a song (Choice 2) throw them out of your way"
							+ "\n and go back to your class room."
							+ "\n ------------------------------------------------------------------------"
							+ "\n Type 13 for choice 1, or type 14 for choice 2. Which do you choose?";

							//8
							//4 else
							prompt8 =
							  "\n You continue on your journey until you reach the edge of the forest."
							+ "\n (Choice 1) go into the forest (Choice 2) go back to the school."
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 15 for choice 1, or type 16 for choice 2. Which do you choose?";



										//math for choice 2, #1
								        if (userAnswer == 1)
								        	{
								        	System.out.println(prompt1);
											userAnswer = in.nextDouble();

								        }

										//math for choice 2, #2
									    else if (userAnswer == 2)
									    	{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 3)
											{
											System.out.println(prompt3);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 4)
											{
											System.out.println(prompt4);
											userAnswer = in.nextDouble();

													}

										//math for choice 2, #1
										else if (userAnswer == 5)
											{
											System.out.println(prompt5);
											userAnswer = in.nextDouble();

													}

										//math for choice 2, #2
										else if (userAnswer == 6)
											{
											System.out.println(prompt6);
											userAnswer = in.nextDouble();

													}
										//math for choice 2, #3
										else if (userAnswer == 7)
											{
											System.out.println(prompt7);
											userAnswer = in.nextDouble();

													}

										//math for choice 2, #4
										else if (userAnswer == 8)
											{
											System.out.println(prompt8);
											userAnswer = in.nextDouble();

													}

										else {
											System.out.println("That wasn't a choice. Please choose another");
											userAnswer = in.nextDouble();
												}




							//1
							//1, if
							prompt1 =
						   	  "\n When you try to jump out of the car, the door seems to be stuck!"
			                + "\n You try to smash the window but you end up breaking your hand"
			                + "\n instead... (Choice 1) accept your fate (Choice 2) try another"
			                + "\n door in the car."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
					        //1, else
							prompt2 =
						   	  "\n You stay inside the car and watch as random things fly by your"
						   	+ "\n window. People honking at each other in the air, unaware that"
						   	+ "\n they are in the air. (Choice 1) roll down your window and inform"
						   	+ "\n that they are driving on clouds (Choice 2) mind your own business"
						   	+ "\n they'll figure it out eventually."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

							//3
							//2, if
							prompt3 =
							  "\n You run towards the woods, but when you look behind you to see if"
							+ "\n your car is still dancing, all you see is a woman in a very large"
							+ "\n dress. You stop running, turn around, and blink a few times (182"
							+ "\n times to be exact)to make sure you're seeing this right. She's "
							+ "\n still there! You look around and nothing is the same as it was"
							+ "\n before! There are no woods behind you and no school in front of"
							+ "\n you. The strange woman is still looking at you. (Choice 1) ask"
							+ "\n her what her problem is (Choice 2) staring contest."
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 5 for choice 1, or type 6 for choice 2. Which do you choose?";

							//4
							//2, else
							prompt4 =
							  "\n You run towards the school, but when you look behind you to see if"
							+ "\n your car is still dancing all you see is a woman in a very large"
							+ "\n dress. You stop running, turn around, and blink a few times (182"
							+ "\n times to be exact)to make sure you're seeing this right. She's "
							+ "\n still there! You look around and nothing is the same as it was"
							+ "\n before! There's no school behind you and no woods in front of"
							+ "\n you. The strange woman is still looking at you. (Choice 1) ask"
							+ "\n her what her problem is (Choice 2) staring contest."
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 5 for choice 1, or type 6 for choice 2. Which do you choose?";

							//5
							//3, if
							prompt5 =
							  "\n You destroy Steele's office. You throw things in the air and break"
							+ "\n things on the walls. You throw a paper weight in the air and grab"
							+ "\n the next thing to throw, but before you have the chance to throw the"
							+ "\n other object, the weight lands on your head. It knocks you out,"
							+ "\n when you wake up you are laying face down in the carpet. You must"
							+ "\n have gotten hit really hard because you feel like the room is"
							+ "\n moving. You even feel the floor moving! You roll over to face the"
							+ "\n ceiling but are suprised when you see that there isn't a celing!"
							+ "\n You are on a flying carpet and soaring through the clouds!"
							+ "\n (Choice 1) jump off the carpet (Choice 2) stay on the carpet and"
							+ "\n see where it takes you."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 9 for choice 1, or type 10 for choice 2. Which do you choose?";

							//6
							//3, else
							prompt6 =
							  "\n You are running out of Steeles' office when you get hit with something"
							+ "\n behind you. It knocks you out for a long time. When you wake up it's"
							+ "\n dark outside. You get off the floor and go into the hallway. Your day"
							+ "\n is getting weirder and weirder, the walls are pink and there's a woman"
							+ "\n in a really large dress standing in the middle of the hall looking at"
							+ "\n you. (Choice 1) punch her in the face. (Choice 2) ask her what her"
							+ "\n problem is."
							+ "\n ---------------------------------------------------------------------"
							+ "\n Type 11 for choice 1, or type 12 for choice 2. Which do you choose?";

							//7
							//4, if
							prompt7 =
							  "\n You call out to people around you and no one answers, they look at you"
							+ "\n but say nothing. You are getting more pissed off by the second. You are"
							+ "\n screaming at everyone and telling them they are all idiots. Your flying"
							+ "\n carpet finally lands... on a cloud. There is a woman waiting there on"
							+ "\n the cloud. She looks at you very disapprovingly and says that you must"
							+ "\n be a bad witch. You are fuming when you tell her you have no idea what"
							+ "\n she is talking about. You step off the carpet and she points behind you."
							+ "\n When you look you see legs sticking out from under the carpet. She says"
							+ "\n that the munchikans want to know if you are a good witch or a bad witch"
							+ "\n because you killed the wicked witch of the west by landing on her. She"
							+ "\n and the munchikans think that you are a bad witch because you were"
							+ "\n very rude to them earlier. (Choice 1) Tell her to go away you aren't"
							+ "\n a witch (Choice 2) ask her to further explain."
							+ "\n ---------------------------------------------------------------------"
							+ "\n Type 13 for choice 1, or type 14 for choice 2. Which do you choose?";

							//8
							//4, else
							prompt8 =
							  "\n You are flying. On a carpet. You are on a flying carpet. You have"
							+ "\n accepted these facts. You sit on the carpet and chill. You think"
							+ "\n about the projects you have yet to grade, and the students who"
							+ "\n have yet to turn them in. You watch the people and things flying"
							+ "\n past you and laugh at their funny faces (Choice 1) throw things"
							+ "\n at them (Choice 2) wave and smile back."
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 15 for choice 1, or type 16 for choice 2. Which do you choose?";

							//9
							//5, if
							prompt9 =
						   	  "\n You grab her arms and try to pull her into the school, you pull and"
			                + "\n pull and pull, and eventually she comes loose. She tumbles into the"
			                + "\n buliding on top of you. You help her up and notice that her eyes are"
			                + "\n straight up red! Her skin is turning into this weird green shade."
			                + "\n You are starting to get really freaked out. (Choice 1) punch her in"
			                + "\n the face. (Choice 2) Shove her against a wall."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 17 for choice 1, and type 18 for choice 2. Which do you choose?";

							//10
					        //5, else
							prompt10 =
						   	  "\n You turn to walk away but a woman in a huge dress is standing in"
						   	+ "\n your way. (Choice 1) staring contest. (Choice 2) punch her in the"
						   	+ "\n face and keep going."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 19 for choice 1, or type 20 for choice 2. Which do you choose?";

							//11
							//6, if
							prompt11 =
							  "\n You start screaming Issues at the top of your lungs because that's"
							+ "\n what any sane person would do in this situation. The students are"
							+ "\n looking at you very weirdly but lol that's not new... (Choice 1)"
							+ "\n Sing all the way back to your class (Choice 2) Keep singing until"
							+ "\n someone kicks you in the face."
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 21 for choice 1, or type 22 for choice 2. Which do you choose?";

							//12
							//6, else
							prompt12 =
							  "\n You are throwing, and kicking, and punching these little people"
							+ "\n put of your way trying to get back to your classroom when the lady"
							+ "\n in the big dress waves her wand and you are paralyed. She looks"
							+ "\n at you and says you are going to either stop or be banished. At"
							+ "\n this point you are so confused you don't even know what to do."
							+ "\n (Choice 1) stop kicking the little people and run to your classroom"
							+ "\n (Choice 2) keep punching them."
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 23 for choice 1, or type 24 for choice 2. Which do you choose?";

							//13
							//7, if
							prompt13 =
							  "\n You start screaming Issues at the top of your lungs because that's"
							+ "\n what any sane person would do in this situation! The students are"
							+ "\n looking at you very weirdly but tbh that's not new... (Choice 1)"
							+ "\n Sing all the way back to your class (Choice 2) stay and keep"
							+ "\n singing until someone kicks you in the face."
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 25 for choice 1, or type 26 for choice 2. Which do you choose?";

							//14
							//7, else
							prompt14 =
							  "\n You are throwing, and kicking, and punching these little people"
							+ "\n put of your way trying to get back to your classroom when the lady"
							+ "\n in the big dress waves her wand and you are paralyed. She looks"
							+ "\n at you and says you are going to either stop or be banished. At"
							+ "\n this point you are so confused you don't even know what to do."
							+ "\n (Choice 1) stop kicking the little people and run to your classroom"
							+ "\n (Choice 2) keep punching them."
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 27 for choice 1, or type 28 for choice 2. Which do you choose?";

							//15
							//8, if
							prompt15 =
							  "\n In the forest, there are singing birds and talking trees. Everything"
							+ "\n since the rain stopped has been weird. Waiting in the woods for you"
							+ "\n is a lady in a huge pink dress. She asks you if you are a good witch"
							+ "\n or a bad witch. You tell her you have no idea what she is talking"
							+ "\n about. She says the munchikans want to know because you killed the"
							+ "\n wicked witch of the west. You still have no idea what she's talking"
							+ "\n about. She tells you to turn around. (Choice 1) turn around (Choice 2)"
							+ "\n run."
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 29 for choice 1, or type 30 for choice 2. Which do you choose?";

							//16
							//8, else
							prompt16 =
							  "\n When you turn around to go back to the school you see an old woman"
							+ "\n trapped in the door you closed on your way out of the school. She"
							+ "\n is wearing striped black and white stockings, a long black dress,"
							+ "\n and a tall black hat. The wind moves her long gray hair out of her"
							+ "\n face and you see that her whole face is green! She looks exactly"
							+ "\n like a witch. (Choice 1) go get a better look (Choice 2) run!"
							+ "\n -------------------------------------------------------------------"
							+ "\n Type 31 for choice 1, or type 32 for choice 2. Which do you choose?";

										//math for choice 2, #1
								        if (userAnswer == 1)
								        	{
								        	System.out.println(prompt1);
											userAnswer = in.nextDouble();

								        }

										//math for choice 2, #2
									    else if (userAnswer == 2)
									    	{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 3)
											{
											System.out.println(prompt3);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 4)
											{
											System.out.println(prompt4);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 5)
											{
											System.out.println(prompt5);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 6)
											{
											System.out.println(prompt6);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 7)
											{
											System.out.println(prompt7);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 8)
											{
											System.out.println(prompt8);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 9)
											{
											System.out.println(prompt9);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 10)
											{
											System.out.println(prompt10);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 11)
											{
											System.out.println(prompt11);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 12)
											{
											System.out.println(prompt12);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 13)
											{
											System.out.println(prompt13);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 14)
											{
											System.out.println(prompt14);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer ==15)
											{
											System.out.println(prompt15);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 16)
											{
											System.out.println(prompt16);
											userAnswer = in.nextDouble();

												}

										else {
											System.out.println("That wasn't a choice. Please choose another.");
											userAnswer = in.nextDouble();
												}

							//1
							//1, if
							prompt1 =
						   	  "\n The object hits your car and the top of the car hits your head."
			                + "\n It knocks you out, when you wake up Your whole car is flying!"
			                + "\n Also the top of the car is no longer dented! (Choice 1) try to"
			                + "\n get out of the car (Choice 2) go with the flow"
			                + "\n ------------------------------------------------------------------"
			                + "\n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
					        //1, else
							prompt2 =
						   	  "\n You are climbing back into the back of the car and trying other"
						   	+ "\n doors but none of them are working. In the back of the car you"
						   	+ "\n give up trying to get out. You lay there and decide to take a nap."
						   	+ "\n You will wait for the car to land and then go from there. (Choice"
						   	+ "\n 1) turn on the radio before your nap (Choice 2) just go to sleep."
						   	+ "\n -----------------------------------------------------------------"
						    + "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

							//3
							//2, if
							prompt3 =
							  "\n You tell them that they are flying and they laugh and tell you"
							+ "\n that you're so silly. They keep looking at you and laughing."
							+ "\n (Choice 1) punch the closest one (Choice 2) leave them alone."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 5 for choice 1, or type 6 for choice 2. Which do you choose?";

							//4
							//2, else
							prompt4 =
							  "\n As you watch them fly by (oblivious that they are still flying)"
							+ "\n You notice how happy they are. You also notice that they are all"
							+ "\n looking at you and whispering. Don't they know that's rude?"
							+ "\n (Choice 1) punch the closest one! Teach them a lesson. (Choice 2)"
							+ "\n leave them alone, be the bigger person."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 7 for choice 1, or type 8 for choice 2. Which do you choose?";

							//5
							//3, if
							prompt5 =
							  "\n When you ask her what her problem is, she just smiles at you. She"
							+ "\n says that she's just thinking. (Choice 1) ask her what she's"
							+ "\n thinking about (Choice 2) walk away. This is too much trouble."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 9 for choice 1, or type 10 for choice 2. Which do you choose?";

							//6
							//3, else
							prompt6 =
							  "\n You and the strange lady have been staring at each other for a"
							+ "\n while now when she looks away and laughs. (Choice 1) Ask her"
							+ "\n what she's laughing at (Choice 2) laugh with her I mean be a"
							+ "\n good sport! You just won!"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 11 for choice 1, or type 12 for choice 2. Which do you choose?";

							//7
							//4, if
							prompt7 =
							  "\n When you ask her what her problem is, she just smiles at you. She"
							+ "\n says that she's just thinking. You have a chance to look around you"
							+ "\n you see little people, named \"munchikans,\" little people, and"
							+ "\n a lot of pretty flowers. (Choice 1) ask her what she's"
							+ "\n thinking about (Choice 2) walk away. This is too much trouble."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 13 for choice 1, or type 14 for choice 2. Which do you choose?";

							//8
							//4, else
							prompt8 =
							  "\n You and the strange lady have been staring at each other for a"
							+ "\n while now when she looks away and laughs. (Choice 1) Ask her"
							+ "\n what she's laughing at (Choice 2) laugh with her I mean be a"
							+ "\n good sport! You just won!"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 15 for choice 1, or type 16 for choice 2. Which do you choose?";

							//9
							//5, if
							prompt9 =
						   	  "\n You try to jump off, but when you reach the edge of the carpet,"
			                + "\n you are stopped by what seems like a solid wall. You can see through"
			                + "\n it but you can't go through it. (Choice 1) give up, go back to the"
			                + "\n middle (Choice 2) jump up and down and try to get the carpet back"
			                + "\n on the ground."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 17 for choice 1, and type 18 for choice 2. Which do you choose?";

							//10
					        //5, else
							prompt10 =
						   	  "\n You are chilling on the carpet and watching everything flyng by you"
						   	+ "\n when all of a sudden it starts falling. Like straight down. You are"
						   	+ "\n holding on for dear life when it hits the ground sending a huge jolt"
						   	+ "\n through you. You look around and try to proccess something other"
						   	+ "\n than whiplash. When you can see clearly, There is a woman in a very"
						   	+ "\n large dress standing in front of you. (Choice 1) Get off the carpet"
						   	+ "\n and talk to her (Choice 2) Stay where you are and wait for her to"
						   	+ "\n leave."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 19 for choice 1, or type 20 for choice 2. Which do you choose?";

							//11
							//6, if
							prompt11 =
							  "\n You punch her in the face with everything you've got, but as soon"
							+ "\n as your fist reaches her face, it goes right through her. You"
							+ "\n fall over and look up at her from the ground. She just keeps"
							+ "\n smiling at you. She says that she can see how confused and scared"
							+ "\n you are. She says she isn't going to hurt you, she just wants to"
							+ "\n help you. (Choice 1) cry and scream and demand things to go back to"
							+ "\n normal (Choice 2) calm down, she wants to help you."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 21 for choice 1, or type 22 for choice 2. Which do you choose?";

							//12
							//6, else
							prompt12 =
							  "\n When you ask her what her problem is, she just looks at you very"
							+ "\n confused. You just keep staring at her until she answers your"
							+ "\n question. When she finally does, all she says is thank you,"
							+ "\n Also the munchikans say thank you. (Choice 1) Now punch her in the"
							+ "\n face. (Choice 2) be patient, she might not be totally crazy."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 23 for choice 1, or type 24 for choice 2. Which do you choose?";

							//13
							//7, if
							prompt13 =
							  "\n You tell her for the millionth time you aren't a witch, and then"
							+ "\n you tell her that if she isn't going to explain further, she"
							+ "\n should leave you alone because you don't need this. You need"
							+ "\n to focus on how to get out of this crazy place and get back"
							+ "\n home. (Choice 1) walk away (Choice 2) give her a second to reply."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 25 for choice 1, or type 26 for choice 2. Which do you choose?";

							//14
							//7, else
							prompt14 =
							  "\n She says that because you killed the wicked witch of the west you"
							+ "\n must also be a witch! You laugh and say no I'm just a person! "
							+ "\n She is confused but she finally accepts it. She then sings a song"
							+ "\n and a whole bunch of little \"munchikans\" come out of the clouds."
							+ "\n (Choice 1) scream (Choice 2) don't scream"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 27 for choice 1, or type 28for choice 2. Which do you choose?";

							//15
							//8, if
							prompt15 =
							  "\n You approach the witch and see that her eyes are closed and she"
							+ "\n isn't breathing. You start to freak out and wonder what to do."
							+ "\n (Choice 1) call for help (Choice 2) leave her there and walk"
							+ "\n away."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 29 for choice 1, or type 30 for choice 2. Which do you choose?";

							//16
							//8, else
							prompt16 =
							  "\n You start running backwards, and fall into something behind you."
							+ "\n You turn around and see a very pretty woman in a huge dress."
							+ "\n She laughs when you apoligize. She says that she has a question for"
							+ "\n you. She wants to know if you're a good witch or a bad witch."
							+ "\n You tell her you aren't a witch at all, and she looks confused."
							+ "\n She tells you the \"munchikans\" want to know. (Choice 1) ask"
							+ "\n her to elaborate (Choice 2) walk away. This chick is crazy."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 31 for choice 1, or type 32 for choice 2. Which do you choose?";

							//17
							//9, if
							prompt17 =
							  "\n You punch her in the face with everything you've got, but as soon"
							+ "\n as your fist reaches her face, it goes right through her. You"
							+ "\n fall over and look up at her from the ground. She just smiles"
							+ "\n at you. She starts walking towards you really slowly like in"
							+ "\n horror movies. (Choice 1) cry and scream and demand things to"
							+ "\n go back to normal (Choice 2) calm down, and try to reason with"
							+ "\n her."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 33 for choice 1, and type 34 for choice 2. Which do you choose?";

							//18
					        //9, else
							prompt18 =
						   	  "\n When you shove her against a wall, she hits her head and falls."
						   	+ "\n You wait and watch her for a while but she doesn't move again."
						   	+ "\n You sit down on the floor and process that you have just killed"
						   	+ "\n someone. You don't get long though, because a woman in a very"
						   	+ "\n large pink dress floats towards you in a equally large pink"
						    + "\n bubble. She lands and looks at the situation. You get to your"
						    + "\n feet and start to explain that it's not what it looks like."
						    + "\n She puts up one hand and puts the other on your arm. She says"
						    + "\n that it doesn't matter what happened. She, and the \"munchikans\""
						    + "\n are very grateful for what you did. (Choice 1) kill her too."
						    + "\n (Choice 2) ask her why and what \" munchikans\" are."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 35 for choice 1, or type 36 for choice 2. Which do you choose?";

							//19
							//10, if
							prompt19 =
							  "\n You and the strange lady have been staring at each other for a"
							+ "\n while now when she looks away and laughs. (Choice 1) Ask her"
							+ "\n what she's laughing at (Choice 2) laugh with her I mean be a"
							+ "\n good sport! You just won!"
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 37 for choice 1, or type 38 for choice 2. Which do you choose?";

							//20
							//10, else
							prompt20 =
							  "\n You punch her in the face with everything you've got, but as soon"
							+ "\n as your fist reaches her face, it goes right through her. You"
							+ "\n fall over and look up at her from the ground. She just keeps"
							+ "\n smiling at you. She says that she can see how confused and scared"
							+ "\n you are. She says she isn't going to hurt you, she just wants to"
							+ "\n help you. (Choice 1) cry and scream and demand things to go back to"
							+ "\n normal (Choice 2) calm down, she wants to help you."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 39 for choice 1, or type 40 for choice 2. Which do you choose?";

							//21
							//11, if
							prompt21 =
							  "\n You reach your classroom and shut the door, you close your eyes."
							+ "\n You take a few minutes leaning against the door and think about"
							+ "\n how to get back to the real world. You open your eyes and see the"
							+ "\n same lady in the big dress. (Choice 1) ask her to explain what she"
							+ "\n meant by \"good teacher\" or \"bad teacher\" (Choice 2) run."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 41 for choice 1, or type 42 for choice 2. Which do you choose?";

							//22
							//11, else
							prompt22 =
							  "\n You stand there and sing for a long time, no one kicks you, but"
							+ "\n instead they join in. You reach the end of the song and are 10"
							+ "\n times more calm than you were before. You start talking to them"
							+ "\n and they are treating you like a queen! (Choice 1) ask what's up"
							+ "\n (Choice 2) go with it."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 43 for choice 1, or type 44 for choice 2. Which do you choose?";

							//23
							//12, if
							prompt23 =
							  "\n Well running back to your classroom was a good idea until you take"
							+ "\n into consideration the fact that you can't move. (Choice 1) apoligize"
							+ "\n to all the little people and assure them you are actually a good"
							+ "\n person (Choice 2) cry"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 45 for choice 1, or type 46 for choice 2. Which do you choose?";

							//24
							//12, else
							prompt24 =
							  "\n Well continuing to punch them was a good idea until you take into"
							+ "\n account the fact that you can't move. (Choice 1) play nice and"
							+ "\n apologize (Choice 2) cry"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 47 for choice 1, or type 48 for choice 2. Which do you choose?";

							//25
							//13, if
							prompt25 =
  							  "\n You reach your classroom and shut the door, you close your eyes."
							+ "\n You take a few minutes leaning against the door and think about"
							+ "\n how to get back to the real world. You open your eyes and see the"
							+ "\n same lady in the big dress. (Choice 1) ask her to explain what she"
							+ "\n meant by \"good teacher\" or \"bad teacher\" (Choice 2) run."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 49 for choice 1, or type 50 for choice 2. Which do you choose?";

							//26
							//13, else
							prompt26 =
							  "\n You stand there and sing for a long time, no one kicks you, but"
							+ "\n instead they join in. You reach the end of the song and are 10"
							+ "\n times more calm than you were before. You start talking to them"
							+ "\n and they are treating you like a queen! (Choice 1) ask what's up"
							+ "\n (Choice 2) go with it."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 51 for choice 1, or type 52 for choice 2. Which do you choose?";

							//27
							//14, if
							prompt27 =
							  "\n Well running back to your classroom was a good idea until you take"
							+ "\n into consideration the fact that you can't move. (Choice 1) apoligize"
							+ "\n to all the little people and assure them you are actually a good"
							+ "\n person (Choice 2) cry"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 53 for choice 1, or type 54 for choice 2. Which do you choose?";

							//28
							//14, else
							prompt28 =
							  "\n Well continuing to punch them was a good idea until you take into"
							+ "\n account the fact that you can't move. (Choice 1) play nice and"
							+ "\n apoligize (Choice 2) cry"
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 55 for choice 1, or type 56 for choice 2. Which do you choose?";

							//29
							//15, if
							prompt29 =
							  "\n You turn around and see a woman laying on the ground. She is"
							+ "\n in the exact same place where you slipped. The trees block her face,"
							+ "\n so all you see is the end of her legs and her feet. On her feet are"
							+ "\n the prettiest pair of shoes you have ever seen. They are red, and"
							+ "\n they sparkle. The lady in the big dress asks you again what kind"
							+ "\n of \"witch\" you are. You ask her instead what happened to the lady."
							+ "\n She says that you killed her and she and the \"munchikans\" are"
							+ "\n very grateful. (Choice 1) keep asking her until she answers your"
							+ "\n question (Choice 2) ask her to further explain the whole \"witch\""
							+ "\n thing."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 57 for choice 1, or type 58 for choice 2. Which do you choose?";

							//30
							//15, else
							prompt30 =
							  "\n You choose to run... but in which direction? (Choice 1) past her,"
							+ "\n deeper into the forest, (Choice 2) behind you, where she's telling"
							+ "\n you to look."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 59 for choice 1, or type 60 for choice 2. Which do you choose?";

							//31
							//16, if
							prompt31 =
							  "\n You walk cautiously towards the woman in the door, and see that she"
							+ "\n is a witch. The wind moves again and opens the door a little, the"
							+ "\n woman falls into the school but not completely because the door"
							+ "\n shuts, all that's sticking out is her legs. You are going to run"
							+ "\n away when you see her shoes. They're amazing! They are red and"
							+ "\n sparkly. You can't take your eyes off them even when there's a"
							+ "\n large pink bubble floating towards you. (Choice 1) find out what"
							+ "\n the bubble is (Choice 2) continue staring at the shoes."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 61 for choice 1, or type 62 for choice 2. Which do you choose?";

							//32
							//16, else
							prompt32 =
							  "\n You run away from the lady stuck in the door only to find an even"
							+ "\n stranger scene behind you. There is a large pink bubble floating"
							+ "\n towards you. (Choice 1) stay and find out what (or who) is in the"
							+ "\n bubble (Choice 2) run in a different direction."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 63 for choice 1, or type 64 for choice 2. Which do you choose?";

										//math for choice 2, #1
								        if (userAnswer == 1)
								        	{
								        	System.out.println(prompt1);
											userAnswer = in.nextDouble();

								        		}

										//math for choice 2, #2
									    else if (userAnswer == 2)
									    	{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 3)
											{
											System.out.println(prompt3);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 4)
											{
											System.out.println(prompt4);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 5)
											{
											System.out.println(prompt5);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 6)
											{
											System.out.println(prompt6);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 7)
											{
											System.out.println(prompt7);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 8)
											{
											System.out.println(prompt8);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 9)
											{
											System.out.println(prompt9);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 10)
											{
											System.out.println(prompt10);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 11)
											{
											System.out.println(prompt11);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 12)
											{
											System.out.println(prompt12);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 13)
											{
											System.out.println(prompt13);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 14)
											{
											System.out.println(prompt14);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer ==15)
											{
											System.out.println(prompt15);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 16)
											{
											System.out.println(prompt16);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
								        if (userAnswer == 17)
								        	{
								        	System.out.println(prompt17);
											userAnswer = in.nextDouble();

								        }

										//math for choice 2, #2
									    else if (userAnswer == 18)
									    	{
											System.out.println(prompt18);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 19)
											{
											System.out.println(prompt19);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 20)
											{
											System.out.println(prompt20);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										if (userAnswer == 21)
											{
											System.out.println(prompt21);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 22)
											{
											System.out.println(prompt22);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 23)
											{
											System.out.println(prompt23);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 24)
											{
											System.out.println(prompt24);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 25)
											{
											System.out.println(prompt25);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 26)
											{
											System.out.println(prompt26);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 27)
											{
											System.out.println(prompt27);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 28)
											{
											System.out.println(prompt28);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										if (userAnswer == 29)
											{
											System.out.println(prompt29);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 30)
											{
											System.out.println(prompt30);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 31)
											{
											System.out.println(prompt31);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 32)
											{
											System.out.println(prompt32);
											userAnswer = in.nextDouble();

												}

										else
											{
											System.out.println("That wasn't a choice. Please choose another.");
											userAnswer = in.nextDouble();
												}


							//1
							//1, if
							prompt1 =
						   	  "\n You try every door and eventually give up. You lay down on the seat"
			                + "\n and contemplate taking a nap. As soon as you close your eyes, the"
			                + "\n car lands. You get out, and look around. There's little people all"
			                + "\n around you, and a woman in a really big dress. There are little"
			                + "\n buildings, and lots of beautiful flowers everywhere. The ground below"
			                + "\n you is a spiral of red and yellow brick. The woman and little people"
			                + "\n tell you that they are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
			                + "\n ------------------------------------------------------------------"
			                + "\n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
					        //1, else
							prompt2 =
						   	  "\n You sit back and watch the people and things that are flying past"
						   	+ "\n you and your magical car. You patiently wait for the car to land"
						   	+ "\n while you contemplate taking a nap. You sit there for what seems"
						   	+ "\n like forever, but eventually the car lands.You get out, and look around. \n There's little people all"
			                + "\n around you, and a woman in a really big dress. There are little"
			                + "\n buildings, and lots of beautiful flowers everywhere. The ground below"
			                + "\n you is a spiral of red and yellow brick. The woman and little people"
			                + "\n tell you that they are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
						   	+ "\n -----------------------------------------------------------------"
						    + "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

							//3
							//2, if
							prompt3 =
							  "\n You turn on the radio but you aren't getting any stations up here."
							+ "\n You flip the station a couple times and all you hear is static."
							+ "\n When the car finally lands, you get out, and look around. There's little people all"
			                + "\n around you, and a woman in a really big dress. There are little"
			                + "\n buildings, and lots of beautiful flowers everywhere. The ground below"
			                + "\n you is a spiral of red and yellow brick. The woman and little people"
			                + "\n tell you that they are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 5 for choice 1, or type 6 for choice 2. Which do you choose?";

							//4
							//2, else
							prompt4 =
							  "\n You grab the extra jacket that's next to you and put it under your"
							+ "\n head. As soon as you are starting to fall asleep, the car jolts"
							+ "\n and then stops moving completely. You've landed! You get out of the"
							+ "\n car and look around. It's amazing! There are flowers and vibrant"
							+ "\n colors all around you. There's little bulidings to go with the"
							+ "\n little people. Under you is a spiral of red and yellow brick roads."
							+ "\n You are looking around at everything when"
							+ "\n a large pink bubble materializes and starts floating towards you."
							+ "\n You watch the bubble float twoards you, and land. Once it's on the"
							+ "\n ground, it starts to dissolve. Inside the bubble is a really pretty"
							+ "\n woman in a huge dress! The woman and little people"
			                + "\n tell you that they are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 7 for choice 1, or type 8 for choice 2. Which do you choose?";

							//5
							//3, if
							prompt5 =
							  "\n You try to punch one but quickly realize you can't. There is an"
							+ "\n invisible wall around the carpet that won't let you reach beyond"
							+ "\n the dimensions of the carpet. You are crawling around the carpet"
							+ "\n trying to find a spot that you can reach out of when you know you"
							+ "\n can't. You give up, and lay down, deciding to take a nap."
							+ "\n As soon as you close your eyes, the"
			                + "\n carpet lands. You get out, and look around. There's little people all"
			                + "\n around you, and a woman in a really big dress. There are little"
			                + "\n buildings, and lots of beautiful flowers everywhere. The ground below"
			                + "\n you is a spiral of red and yellow brick. The woman and little people"
			                + "\n tell you that they are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your carpet. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 9 for choice 1, or type 10 for choice 2. Which do you choose?";

							//6
							//3, else
							prompt6 =
							  "\n You continue flying and try to ignore the other people that are"
							+ "\n still looking at you. You sit there staring straight ahead for"
							+ "\n what seems like forever, when suddenly you wake up. You had no"
							+ "\n idea that you were asleep. You look around and see a woman"
							+ "\n in a very large dress looking at you. You keep looking. You see"
							+ "\n two brick roads. One is yellow and the other is red. There are"
							+ "\n flowers and little mini buildings everywhere. You feel like you"
							+ "\n are in a dollhouse! The whole little town is really pretty"
							+ "\n overall. You turn back to the woman and say hi. She smiles and"
							+ "\n says The woman and little people are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your carpet. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 11 for choice 1, or type 12 for choice 2. Which do you choose?";

							//7
							//4, if
							prompt7 =
							  "\n You try to punch one but quickly realize you can't. There is an"
							+ "\n invisible wall around the carpet that won't let you reach beyond"
							+ "\n the dimensions of the carpet. You are crawling around the carpet"
							+ "\n trying to find a spot that you can reach out of when you know you"
							+ "\n can't. You give up, and lay down, deciding to take a nap."
							+ "\n As soon as you close your eyes, the"
			                + "\n carpet lands. You get out, and look around. There's little people all"
			                + "\n around you, and a woman in a really big dress. There are little"
			                + "\n buildings, and lots of beautiful flowers everywhere. The ground below"
			                + "\n you is a spiral of red and yellow brick. The woman and little people"
			                + "\n tell you that they are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your carpet. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 13 for choice 1, or type 14 for choice 2. Which do you choose?";

							//8
							//4, else
							prompt8 =
							 "\n You continue flying and try to ignore the other people that are"
							+ "\n still looking at you. You sit there staring straight ahead for"
							+ "\n what seems like forever, when suddenly you wake up. You had no"
							+ "\n idea that you were asleep. You look around and see a woman"
							+ "\n in a very large dress looking at you. You keep looking. You see"
							+ "\n two brick roads. One is yellow and the other is red. There are"
							+ "\n flowers and little mini buildings everywhere. You feel like you"
							+ "\n are in a dollhouse! The whole little town is really pretty"
							+ "\n overall. You turn back to the woman and say hi. She smiles and"
							+ "\n says The woman and little people are so grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your carpet. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 15 for choice 1, or type 16 for choice 2. Which do you choose?";

							//9
							//5, if
							prompt9 =
						   	  "\n She says she's trying to figure you out. She want to know what"
			                + "\n kind of witch you are. Good or bad? Before you have time to answer,"
			                + "\n she tells you nevermind, they are just so grateful that you killed"
			                + "\n the wicked witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 17 for choice 1, and type 18 for choice 2. Which do you choose?";

							//10
					        //5, else
							prompt10 =
						   	  "\n You turn to walk away but the entire place has changed. There are no"
						   	+ "\n longer woods in front of you. There are two brick roads. One is yellow"
						   	+ "\n and the other is red. You keep looking around you and see really pretty"
						   	+ "\n flowers everywhere. You are standing in the middle of a town! The"
						   	+ "\n buildings that surround you are really small. It seems like you have"
						   	+ "\n been shrunk and put in a little dollhouse! You decide to talk to the"
						   	+ "\n woman again, she says nevermind, she and the \"munchikans\" are "
						   	+ "\n grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 19 for choice 1, or type 20 for choice 2. Which do you choose?";

							//11
							//6, if
							prompt11 =
							  "\n She says that she is laughing because she figured out what kind"
							+ "\n of witch you are. You keep looking at her, and wait for her to"
							+ "\n respond. She says that you are a bad witch because you have an"
							+ "\n \"unfriendly face.\" That makes you laugh. You tell her you"
							+ "\n really have no idea what she's talking about. You say that your"
							+ "\n face is unfriendly because you have no idea where you are."
							+ "\n She says \"this is munchkin land, look around you.\" You take"
							+ "\n her advice and look around. There are now a whole bunch of little"
							+ "\n people all around you. There's lots of pretty flowers, and a yellow"
							+ "\n and red spiraling road under you. she says nevermind, she and the"
						   	+ "\n \"munchkins\" are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 21 for choice 1, or type 22 for choice 2. Which do you choose?";

							//12
							//6, else
							prompt12 =
							  "\n You laugh with her, she puts a hand on your back and turns you"
							+ "\n around. You finally get a chance to look at your new surroundings."
							+ "\n There's flowers everywhere, and little small buildings. Under you,"
							+ "\n there are two roads. One is yellow and one is red. You continue"
							+ "\n to take everything in when you realize that there are no people"
							+ "\n in this town. It's just you and the lady. She starts telling the"
							+ "\n air \"you can come out.\" You are really confused at first, and"
							+ "\n then little people start coming out of buildings and bushes and"
							+ "\n stuff. Now you're extra confused. Once the little people have"
							+ "\n assembled around you, she tells them that you are a good witch"
							+ "\n so they don't have to worry... She sees that you are confused, and"
							+ "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 23 for choice 1, or type 24 for choice 2. Which do you choose?";

							//13
							//7, if
							prompt13 =
							  "\n She looks at you and says that she's thinking about you. She's"
							+ "\n wondering what kind of witch you are. She sees how confused you"
							+ "\n are, and says never mind, she and the"
						   	+ "\n munchkins are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 25 for choice 1, or type 26 for choice 2. Which do you choose?";

							//14
							//7, else
							prompt14 =
							  "\n You turn to walk away, but then you again, notice something"
							+ "\n strange. There are no more woods. You are now in a little"
							+ "\n town. There's pretty flowers and little small buildings"
							+ "\n everywhere. There are two winding roads on the ground. One is"
							+ "\n red and the other is yellow. You turn back to the woman and"
							+ "\n decide that you should listen to what she has to say. She"
							+ "\n patiently waits for you to clam down before continuing to"
							+ "\n talk. She asks you if you are a good witch or a bad witch."
							+ "\n She says nevermind when she sees how confused you are, she"
							+ "\n just wants you to know how grateful she and the munchikans"
							+ "\n are for killing the witch, They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 27 for choice 1, or type 28 for choice 2. Which do you choose?";

							//15
							//8, if
							prompt15 =
							  "\n She says that she is laughing because she figured out what kind"
							+ "\n of witch you are. You keep looking at her, and wait for her to"
							+ "\n respond. She says that you are a bad witch because you have an"
							+ "\n \"unfriendly face.\" That makes you laugh. You tell her you"
							+ "\n really have no idea what she's talking about. You say that your"
							+ "\n face is unfriendly because you have no idea where you are."
							+ "\n She says \"this is munchikan land, look around you.\" You take"
							+ "\n her advice and look around. There are now a whole bunch of little"
							+ "\n people all around you. There's lots of pretty flowers, and a yellow"
							+ "\n and red spiraling road under you. she says nevermind, she and the"
						   	+ "\n \"munchikans\" are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 29 for choice 1, or type 30 for choice 2. Which do you choose?";

							//16
							//8, else
							prompt16 =
							  "\n You laugh with her, she puts a hand on your back and turns you"
							+ "\n around. You finally get a chance to look at your new surroundings."
							+ "\n There's flowers everywhere, and little small buildings. Under you,"
							+ "\n there are two roads. One is yellow and one is red. You continue"
							+ "\n to take everything in when you realize that there are no people"
							+ "\n in this town. It's just you and the lady. She starts telling the"
							+ "\n air \"you can come out.\" You are really confused at first, and"
							+ "\n then little people start coming out of buildings and bushes and"
							+ "\n stuff. Now you're extra confused. Once the little people have"
							+ "\n assembled around you, she tells them that you are a good witch"
							+ "\n so they don't have to worry... She sees that you are confused, and"
							+ "\n says nevermind, she and the \"munchikans\" are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 31 for choice 1, or type 32 for choice 2. Which do you choose?";

							//17
							//9, if
							prompt17 =
							  "\n You lay down in the middle of the carpet, out of breath. You look up"
							+ "\n at the sky and see that it is no longer blue. The sky is every"
							+ "\n color of the rainbow all swirled together You are still watching the"
							+ "\n sky when you realize that it is not moving, and if the sky isn't"
							+ "\n moving... then neither are you. You look around you and see many"
							+ "\n things. You see flowers everywhere, and little buildings lining"
							+ "\n two yellow and red winding roads in the middle of the little town. Next you see a"
							+ "\n woman. She is wearing a reallyyy large dress. She is looking at you"
							+ "\n with a very balnk face that makes you wonder how long you've been"
							+ "\n laying there. You get up, and approach her. She greets you, and"
							+ "\n then asks you \"what kind of witch you are.\" She waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
						    + "\n says nevermind, she and the \"munchkins\" are grateful for killing the witch. They point"
						    + "\n behind you, you turn around and see a pair of legs. The other half of the"
						    + "\n body is covered by your carpet. You somehow know that this is a witch, and"
						    + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
						    + "\n There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead lady's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 33 for choice 1, and type 34 for choice 2. Which do you choose?";

							//18
					        //9, else
							prompt18 =
						   	  "\n Jumping up and down is only making the carpet fly faster. The carpet"
						   	+ "\n hits a cloud and you fall down. You are laying on the carpet and"
						   	+ "\n looking at the sky, accepting that you have lost and the carpet"
						   	+ "\n has won. You keep looking at the sky when you realize that the"
						   	+ "\n carpet isn't moving. You look around you and see many things."
							+ "\n You see flowers everywhere, and little buildings lining"
							+ "\n two winding roads in the middle of the little town. Next you see a"
							+ "\n woman. She is wearing a veryyy large dress. She is looking at you"
							+ "\n with a very balnk face that makes you wonder how long you've been"
							+ "\n laying there. You get up, and approach her. She greets you, and"
							+ "\n then asks you \"what kind of witch you are.\" She waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
						    + "\n says nevermind, she and the \"munchkins\" are grateful for killing the witch. They point"
						    + "\n behind you, you turn around and see a pair of legs. The other half of the"
						    + "\n body is covered by your carpet. You somehow know that this is a witch, and"
						    + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
						    + "\n There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead lady's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 35 for choice 1, or type 36 for choice 2. Which do you choose?";

							//19
							//10, if
							prompt19 =
							  "\n You get off the carpet and smile at her. She smiles back. She looks"
							+ "\n at you for a minute and then asks you \"what kind of witch you are.\""
							+ "\n You tell her that you aren't a witch at all. You're just " +userName+ ""
							+ "\n She says that you must be a witch because you killed the Wicked"
							+ "\n Witch of the West. She waits a minute for you to answer, but then gives up"
							+ "\n when she sees how confused you are because she says she and the"
							+ "\n \"munchkins\" are grateful for killing the witch. They point"
						    + "\n behind you, you turn around and see a pair of legs. The other half of the"
						    + "\n body is covered by your carpet. You somehow know that this is a witch, and"
						    + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
						    + "\n There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead lady's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 37 for choice 1, or type 38 for choice 2. Which do you choose?";

							//20
							//10, else
							prompt20 =
							  "\n You look at her and wait for her to leave, she just keeps looking"
							+ "\n back at you. You are staring at each other for a while when finally"
							+ "\n she reaches out a hand and offers to help you up. You get to your"
							+ "\n feet and look around. You see flowers everywhere, and little buildings lining"
							+ "\n two winding roads in the middle of the little town. Around the"
							+ "\n woman are a whole bunch of little people. Under you are two yellow"
							+ "\n and red brick roads. The woman greets you, and"
							+ "\n then asks you \"what kind of witch you are.\" She waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
						    + "\n says nevermind, she and the \"munchkins\" are grateful for killing the witch. They point"
						    + "\n behind you, you turn around and see a pair of legs. The other half of the"
						    + "\n body is covered by your carpet. You somehow know that this is a witch, and"
						    + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
						    + "\n There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead lady's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 39 for choice 1, or type 40 for choice 2. Which do you choose?";

							//21
							//11, if
							prompt21 =
							  "\n You start screaming, and you tell her that you miss your cat. She"
							+ "\n reaches out a hand to help you up, and you take it. You wipe off"
							+ "\n your face and look at her. She says \"now that you're calm, I"
							+ "\n want to ask you a question. Are you a good witch? or a bad witch?\""
							+ "\n You tell her that you aren't a witch, but if you were one, you"
							+ "\n would be a good witch. She says that you must be a witch because"
							+ "\n you killed the Wicked Witch of the West. She waits a minute for you to answer, but then gives up"
							+ "\n when she sees how confused you are because she says she and the"
							+ "\n \"munchkins\" are grateful for killing the witch. They point"
						    + "\n behind you, you turn around and see a pair of legs. The other half of the"
						    + "\n body is covered by your carpet. You somehow know that this is a witch, and"
						    + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
						    + "\n There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead lady's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 41 for choice 1, or type 42 for choice 2. Which do you choose?";

							//22
							//11, else
							prompt22 =
							  "\n You apologize and tell her you shouldn't have tried to punch her"
							+ "\n in the face. You realize that isn't nice. She smiles and tells you"
							+ "\n it's alright. Then she asks you what kind of witch you are. You"
							+ "\n decide that this woman is crazy, and you want to punch her in the"
							+ "\n face again. She waits a minute for you to answer, but then gives up"
							+ "\n when she sees how confused you are When you ask, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 43 for choice 1, or type 44 for choice 2. Which do you choose?";

							//23
							//12, if
							prompt23 =
							  "\n You punch her in the face with everything you've got, but as soon"
							+ "\n as your fist reaches her face, it goes right through her. You"
							+ "\n fall over and look up at her from the ground. She just keeps"
							+ "\n smiling at you. She says that she can see how confused and scared"
							+ "\n you are. She says she isn't going to hurt you, she just wants to"
							+ "\n help you. You get to your"
							+ "\n feet and look around. You see flowers everywhere, and little buildings lining"
							+ "\n two winding roads in the middle of the little town. Around the"
							+ "\n woman are a whole bunch of little people. Under you are two yellow"
							+ "\n and red brick roads. The woman greets you, and"
							+ "\n then asks you \"what kind of witch you are.\" She waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
						    + "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
						    + "\n behind you, you turn around and see a pair of legs. The other half of the"
						    + "\n body is covered by your carpet. You somehow know that this is a witch, and"
						    + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
						    + "\n There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead lady's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 45 for choice 1, or type 46 for choice 2. Which do you choose?";

							//24
							//12, else
							prompt24 =
							  "\n You wait for her to elaborate but she doesn't. You finally get"
							+ "\n annoyed and ask her what she means. She says that because you"
							+ "\n killed the wicked witch of the west, they are all forever in"
							+ "\n your debt. Before you can answer, another lady flys in on a"
							+ "\n broomstick! While you are studying Your surroundings, you see"
							+ "\n a lot of other things. You see flowers everywhere, and little buildings lining"
							+ "\n two winding roads in the middle of the little town. Around the"
							+ "\n woman are a whole bunch of little people. Under you are two yellow"
							+ "\n and red brick roads.  The second lady doesn't look anything like the first"
							+ "\n one. She looks like a witch! She looks behind you and falls to"
							+ "\n her knees. She starts weeping like a child. You look behind you"
							+ "\n and see the door that you shut on your way out of Steele's office."
							+ "\n Under the door are 2 legs. On the feet of the legs are red sparkly"
							+ "\n shoes. The witch says that she is going to kill you. The pretty"
							+ "\n lady (who turned out to also be a witch-a pretty witch!) says that"
							+ "\n she will protect you, and she puts her arm around you. The old witch"
							+ "\n reaches for the shoes, but in the blink of an eye, the shoes are"
							+ "\n gone! The legs shrivel up, and disappear under the door. You look down, and see the shoes"
							+ "\n pop onto your feet. She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 47 for choice 1, or type 48 for choice 2. Which do you choose?";

							//25
							//13, if
							prompt25 =
  							  "\n You start to walk away, but as soon as you turn around, you see"
							+ "\n another witch fly in on a broom and land in front of you. She is"
							+ "\n so ugly and terrifying that you back up away from her. She sees"
							+ "\n the legs and flips out. She says through her tears that she's"
							+ "\n going to kill you. The pretty lady (who turned out to also be"
							+ "\n a witch-a pretty witch!) puts her arm around you and says that"
							+ "\n she will protect you. The witch steps toward the carpet where"
							+ "\n the legs are. As she reaches for the shoes that are on the other"
							+ "\n witch. The shoes are red, and sparkly, and beautiful. As soon as"
							+ "\n she touches the shoes, they disappear, and the legs shrivel up and"
							+ "\n retract under the carpet. Run away! (Choice 2)"
							+ "\n stay with the pretty witch."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 49 for choice 1, or type 50 for choice 2. Which do you choose?";

							//26
							//13, else
							prompt26 =
							  "\n She tells  you that if you want to get home, all you have to do"
							+ "\n is follow the yellow brick road. Now you know she's insane."
							+ "\n you turn to walk away, but you see another lady fly towards you."
							+ "\n She is flying on a broom, and looks just like a witch! She's so"
							+ "\n ugly and wretched that you step back. The pretty witch puts her"
							+ "\n arm around you and says that she'll protect you. She steps in"
							+ "\n front of you and addresses the ugly witch. When the wicked witch"
							+ "\n sees the legs, she flips out. She looks at you and swears that"
							+ "\n she will kill you. Then she looks back to the legs, and runs"
							+ "\n towards them. As soon as she reaches out to touch the red, sparkly"
							+ "\n shoes the witch is wearing, the shoes disappear and the legs shrivel"
							+ "\n up and retract under the carpet. You look down, and see the shoes"
							+ "\n pop onto your feet. She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 51 for choice 1, or type 52 for choice 2. Which do you choose?";

							//27
							//14, if
							prompt27 =
							  "\n You start screaming, and turn around to run away, but as soon as"
							+ "\n you take a step, you realize there is a person under your foot."
							+ "\n You look down, but all you can see is the persons legs. The rest"
							+ "\n of the person is covered in clouds. You jump back into the pretty"
							+ "\n witch and she steps in front of you protectively. You look around"
							+ "\n her and see another lady. She really looks like a witch. She's even"
							+ "\n green! She's so ugly and vile, you step back away from her. When"
							+ "\n the ugly witch sees the legs, she flips out. She runs towards the"
							+ "\n legs and reaches out towards the shoes. As soon as her hand makes"
							+ "\n contact, the shoes disappear, and the legs shrivel up and retract"
							+ "\n into the clouds. (Choice 1) kill the ugly witch.(Choice 2) stay"
							+ "\n with the pretty witch."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 53 for choice 1, or type 54 for choice 2. Which do you choose?";

							//28
							//14, else
							prompt28 =
							  "\n You stand there, shocked. All the \"munchkins\" are standing around"
							+ "\n you, singing a song. Then, they all stop singing and stare at the"
							+ "\n ground right next to you. A gross old witch comes out of the clouds,"
							+ "\n laughing very eerily. She looks behind you, at the carpet and starts"
							+ "\n crying. You turn, and see, under the carpet two legs sticking out."
							+ "\n On the legs are the most beautiful pair of shoes in the world."
							+ "\n They are red, and sparkly! The witch runs towards them, but as soon"
							+ "\n as she touches them, they disappear. She points her long creepy"
							+ "\n staff thing at you and the lady in the pink dress, and says that she"
							+ "\n will get you. She keeps looking at your feet, you look down, and"
							+ "\n see the shoes on your feet! Then the ugly witch leaves in a puff"
							+ "\n of air. (Choice 1) Run away! (Choice 2) Stay and talk to the"
							+ "\n pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 55 for choice 1, or type 56 for choice 2. Which do you choose?";

							//29
							//15, if
							prompt29 =
							  "\n You call for help, and it appears in the shape of a woman in a"
							+ "\n very large dress. She smiles at you but as soon as she appears,"
							+ "\n so does another woman. She's vile and disgusting. She starts"
							+ "\n towards the woman on the floor and starts to cry. On her feet"
							+ "\n are red, sparkly shoes, that the vile woman starts towards."
							+ "\n The woman in the dress stops her. As soon as the witch touches"
							+ "\n the shoe, it disappears. They pop onto your feet! She points"
							+ "\n her long creepy staff thing at you and the lady in the pink"
							+ "\n dress, and says that she will get you Then the ugly witch"
							+ "\n leaves in a puff of air. (Choice 1) Run away! (Choice 2) Stay"
							+ "\n and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 57 for choice 1, or type 58 for choice 2. Which do you choose?";

							//30
							//15, else
							prompt30 =
							  "\n You start to walk away, but behind you there's another woman. She"
							+ "\n is wearing a really big pink dress and points to the ugly woman"
							+ "\n on the ground. She says \"That's the wicked witch of the west.\""
							+ "\n Then she thanks you. She explains that that woman is very evil"
							+ "\n and you killed her! Then another woman appears. She's vile and"
							+ "\n disgusting. She starts towards the woman on the floor and starts"
							+ "\n to cry. On her feet are red, sparkly shoes, that the vile woman"
							+ "\n starts towards. The woman in the dress stops her. As soon as the"
							+ "\n witch touches the shoe, it disappears. They pop onto your feet!"
							+ "\n She points her long creepy staff thing at you and the lady in the"
							+ "\n pink dress, and says that she will get you Then the ugly witch"
							+ "\n leaves in a puff of air. (Choice 1) Run away! (Choice 2) Stay"
							+ "\n and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 59 for choice 1, or type 60 for choice 2. Which do you choose?";

							//31
							//16, if
							prompt31 =
							  "\n She is in the middle of explaining what \"munchkins\" are, when"
							+ "\n another woman appears. She's vile and disgusting. She starts"
							+ "\n towards the woman on the floor and starts to cry. On her feet"
							+ "\n are red, sparkly shoes, that the vile woman starts towards."
							+ "\n The woman in the dress stops her. As soon as the witch touches"
							+ "\n the shoe, it disappears. They pop onto your feet! She points"
							+ "\n her long creepy staff thing at you and the lady in the pink"
							+ "\n dress, and says that she will get you Then the ugly witch"
							+ "\n leaves in a puff of air. (Choice 1) Run away! (Choice 2) Stay"
							+ "\n and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 61 for choice 1, or type 62 for choice 2. Which do you choose?";

							//32
							//16, else
							prompt32 =
							  "\n You are walking away when, another woman appears. She's vile"
							+ "\n and disgusting. She starts towards the woman on the floor and"
							+ "\n starts to cry. On her feet are red, sparkly shoes, that the"
							+ "\n gross woman starts towards. The woman in the dress stops her."
							+ "\n As soon as the witch touches the shoe, it disappears. They pop"
							+ "\n onto your feet! She points her long creepy staff thing at you"
							+ "\n and the lady in the pink dress, and says that she will get you"
							+ "\n Then the ugly witch leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 63 for choice 1, or type 64 for choice 2. Which do you choose?";

							//33
							//17, if
							prompt33 =
						   	  "\n You cry and scream, and your tears are getting on her. She starts"
			                + "\n screaming. Her skin is melting off her in chunks. She falls to her"
			                + "\n knees, dead. Then 2 women appear. One on each side of you. You"
			                + "\n take one more look at the shriveled up woman in front of you."
			                + "\n One woman is beautiful, and the other one is vile, digusting, and"
			                + "\n creepy. The nasty one crys while the pretty one cheers."
			                + "\n On the womans feet, are a pair of red, sparkly shoes. The ugly"
			                + "\n witch trys to grab the shoes, but as soon as she touches them,"
			                + "\n the shoes disappear. They pop"
							+ "\n onto your feet! She points her long creepy staff thing at you"
							+ "\n and the lady in the pink dress, and says that she will get you"
							+ "\n Then the ugly witch leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
			                + "\n ------------------------------------------------------------------"
			                + "\n Type 65 for choice 1, and type 66 for choice 2. Which do you choose?";

							//34
					        //17, else
							prompt34 =
						   	  "\n You keep backing up as she advances on you. You are backed against"
						   	+ "\n a wall when you decide to kill her. You grab her head and shove"
						   	+ "\n her into the wall. She falls into the wall like it's invisible."
						   	+ "\n Her legs are sticking out from the wall, and you notice something"
						   	+ "\n you didn't notice before. The shoes on her feet are really pretty."
						   	+ "\n You are standing there looking at the shoes when 2 more women"
						   	+ "\n appear, one after the other. One woman is beautiful, \n and the other one is vile, disgusting, and"
			                + "\n creepy. The nasty one crys when she sees the woman's legs \n while the pretty one cheers."
			                + "\n On the womans feet, are a pair of red, sparkly shoes. The ugly"
			                + "\n witch trys to grab the shoes, but as soon as she touches them,"
			                + "\n the shoes dissapear. They pop"
							+ "\n onto your feet! She points her long creepy staff thing at you"
							+ "\n and the lady in the pink dress, and says that she will get you"
							+ "\n Then the ugly witch leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
						   	+ "\n -----------------------------------------------------------------"
						    + "\n Type 67 for choice 1, or type 68 for choice 2. Which do you choose?";

							//35
							//18, if
							prompt35 =
							  "\n When you blink, you are in a totally different place than you"
							+ "\n were before. There's a whole bunch of little people, pretty"
							+ "\n flowers and more small things. The ground below you is a"
							+ "\n spiral of yellow and red brick roads. You decide that this is"
							+ "\n way to bizzare to kill the other woman. You need her for"
							+ "\n answers. You decide to go with choice 2 and ask her what"
							+ "\n \"munchkins\" are. She motions around you to the little"
							+ "\n people and says \"There are munchkins.\" She opens her"
							+ "\n mouth to say something else but another shows up next to her."
							+ "\n The other lady looks a little like the one that you killed..."
							+ "\n She looks disgusting. She looks at you, and then runs towards"
							+ "\n the woman on the ground. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly witch leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 69 for choice 1, or type 70 for choice 2. Which do you choose?";

							//36
							//18, else
							prompt36 =
							   "\n When you blink, you are in a totally different place than you"
							+ "\n were before. There's a whole bunch of little people, pretty"
							+ "\n flowers and more small things. The ground below you is a"
							+ "\n spiral of yellow and red brick roads."
							+ "\n You ask her what"
							+ "\n \"munchkins\" are. She motions around you to the little"
							+ "\n people and says \"There are munchikans.\" She opens her"
							+ "\n mouth to say something else but another shows up next to her."
							+ "\n The other lady looks a little like the one that you killed..."
							+ "\n She looks disgusting. She looks at you, and then runs towards"
							+ "\n the woman on the ground. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly witch leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 71 for choice 1, or type 72 for choice 2. Which do you choose?";

							//37
							//19, if
							prompt37 =
							  "\n She says that she is laughing because she figured out what kind"
							+ "\n of witch you are. You keep looking at her, and wait for her to"
							+ "\n respond. She says that you are a bad witch because you have an"
							+ "\n \"unfriendly face.\" That makes you laugh. You tell her you"
							+ "\n really have no idea what she's talking about. You say that your"
							+ "\n face is unfriendly because you have no idea where you are."
							+ "\n She says \"this is munchikan land, look around you.\" You take"
							+ "\n her advice and look around. There are now a whole bunch of little"
							+ "\n people all around you. There's lots of pretty flowers, and a yellow"
							+ "\n and red spiraling road under you. she says nevermind, she and the"
						   	+ "\n \"munchikans\" are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 73 for choice 1, or type 74 for choice 2. Which do you choose?";

							//38
							//19, else
							prompt38 =
							  "\n You laugh with her, she puts a hand on your back and turns you"
							+ "\n around. You finally get a chance to look at your new surroundings."
							+ "\n There's flowers everywhere, and little small buildings. Under you,"
							+ "\n there are two roads. One is yellow and one is red. You continue"
							+ "\n to take everything in when you realize that there are no people"
							+ "\n in this town. It's just you and the lady. She starts telling the"
							+ "\n air \"you can come out.\" You are really confused at first, and"
							+ "\n then little people start coming out of buildings and bushes and"
							+ "\n stuff. Now you're extra confused. Once the little people have"
							+ "\n assembled around you, she tells them that you are a good witch"
							+ "\n so they don't have to worry... She sees that you are confused, and"
							+ "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
			                + "\n behind you, you turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by your car. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 75 for choice 1, or type 76 for choice 2. Which do you choose?";

							//39
							//20, if
							prompt39 =
							  "\n You start screaming, and you tell her that you miss your cat. She"
							+ "\n reaches out a hand to help you up, and you take it. You wipe off"
							+ "\n your face and look at her. She says \"now that you're calm, I"
							+ "\n want to ask you a question. Are you a good witch? or a bad witch?\""
							+ "\n You tell her that you aren't a witch, but if you were one, you"
							+ "\n would be a good witch. She says that you must be a witch because"
							+ "\n you killed the Wicked Witch of the West. She waits a minute for you to answer, but then gives up"
							+ "\n when she sees how confused you are because she says she and the"
							+ "\n \"munchkins\" are grateful for killing the witch. They point"
							+ "\n behind you, you turn around and see a pair of legs. The other half of the"
							+ "\n body is covered by your carpet. You somehow know that this is a witch, and"
							+ "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
							+ "\n There's a loud pop behind you, you look behind"
							+ "\n you and see a really, really ugly woman standing there. She looks at"
							+ "\n the witch on the ground, and runs towards the legs. She reaches for"
							+ "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 77 for choice 1, or type 78 for choice 2. Which do you choose?";

							//40
							//20, else
							prompt40 =
							  "\n You apologize and tell her you shouldn't have tried to punch her"
							+ "\n in the face. You realize that isn't nice. She smiles and tells you"
							+ "\n it's alright. Then she asks you what kind of witch you are. You"
							+ "\n decide that this woman is crazy, and you want to punch her in the"
							+ "\n face again. She waits a minute for you to answer, but then gives up"
							+ "\n when she sees how confused you are When you ask, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
							+ "\n person is a witch, and you killed her... somehow. You turn and"
							+ "\n talk to the woman and the little people, but then you hear a very"
							+ "\n loud pop behind you. You turn around and see a woman stading behind"
							+ "\n you, she runs towards the legs and reaches for the shoes."
							+ "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 79 for choice 1, or type 80 for choice 2. Which do you choose?";

							//41
							//21, if
							prompt41 =
						   	  "\n After you ask her that question, you notice There's flowers everywhere,"
							+ "\n and little small buildings. Under you, there are two roads. One is"
			                + "\n yellow and one is red. You are surrounded by little small people."
			                + "\n She motions around you to the little"
							+ "\n people and says \"There are munchkins.\" and they thank you."
			                + "\n You ask her what she means, and she points under you. You look"
			                + "\n at your feet and you see legs with pretty red shoes on the feet."
			                + "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 81 for choice 1, and type 82 for choice 2. Which do you choose?";

							//42
					        //21, else
							prompt42 =
						   	  "\n You run away, but then realize that you stepped on a person. You turn"
						   	+ "\n around, and see a pair of legs sticking out of the ground. On the"
						   	+ "\n feet are really pretty red shoes. While you are looking at the red shoes,"
							+ "\n someone comes sprinting from behind you, and tries to get the shoes."
						   	+ "\n but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away again. (Choice 2) Stay and talk to the other woman."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 83 for choice 1, or type 84 for choice 2. Which do you choose?";

							//43
							//22, if
							prompt43 =
							  "\n When you ask, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 85 for choice 1, or type 86 for choice 2. Which do you choose?";

							//44
							//22, else
							prompt44 =
							  "\n You have a nice conversation with the students, and the pretty"
							+ "\n lady when they start expressing their gratitude for you."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 87 for choice 1, or type 88 for choice 2. Which do you choose?";

							//45
							//23, if
							prompt45 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 89 for choice 1, or type 90 for choice 2. Which do you choose?";

							//46
							//23, else
							prompt46 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 91 for choice 1, or type 92 for choice 2. Which do you choose?";

							//47
							//24, if
							prompt47 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 93 for choice 1, or type 94 for choice 2. Which do you choose?";

							//48
							//24, else
							prompt48 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 95 for choice 1, or type 96 for choice 2. Which do you choose?";

							//49
							//25, if
							prompt49 =
							  "\n After you ask her that question, you notice There's flowers everywhere,"
							+ "\n and little small buildings. Under you, there are two roads. One is"
			                + "\n yellow and one is red. You are surrounded by little small people."
			                + "\n She motions around you to the little"
							+ "\n people and says \"There are munchkins.\" and they thank you."
			                + "\n You ask her what she means, and she points under you. You look"
			                + "\n at your feet and you see legs with pretty red shoes on the feet."
			                + "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
			                + "\n ---------------------------------------------------------------------"
			                + "\n Type 97 for choice 1, and type 98 for choice 2. Which do you choose?";

							//50
					        //25, else
							prompt50 =
						   	 "\n You run away, but then realize that you stepped on a person. You turn"
						   	+ "\n around, and see a pair of legs sticking out of the ground. On the"
						   	+ "\n feet are really pretty red shoes. While you are looking at the red shoes,"
							+ "\n someone comes sprinting from behind you, and tries to get the shoes."
						   	+ "\n but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away again. (Choice 2) Stay and talk to the other woman."
						   	+ "\n --------------------------------------------------------------------"
						    + "\n Type 99 for choice 1, or type 100 for choice 2. Which do you choose?";

							//51
							//26, if
							prompt51 =
							  "\n You have a nice conversation with the students, and the pretty"
							+ "\n lady when they start expressing their gratitude for you."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n --------------------------------------------------------------------"
							+ "\n Type 101 for choice 1, or type 102 for choice 2. Which do you choose?";

							//52
							//26, else
							prompt52 =
							  "\n You have a nice conversation with the students, and the pretty"
							+ "\n lady when they start expressing their gratitude for you."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 103 for choice 1, or type 104 for choice 2. Which do you choose?";

							//53
							//27, if
							prompt53 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 105 for choice 1, or type 106 for choice 2. Which do you choose?";

							//54
							//27, else
							prompt54 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 107 for choice 1, or type 108 for choice 2. Which do you choose?";

							//55
							//28, if
							prompt55 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 109 for choice 1, or type 110 for choice 2. Which do you choose?";

							//56
							//28, else
							prompt56 =
							  "\n You decide to do both actually. You are explaining that you"
							+ "\n have no idea where you are, and you don't know how to get"
							+ "\n home. They tell you that it's alright. You can feel your body"
							+ "\n again! They tell you that they really grateful for what you did."
							+ "\n When you ask about it, they tell you it's because they are very grateful"
							+ "\n that you killed the wicked witch. You tell them you have no idea"
							+ "\n what they mean and they tell you to look behind you. You look"
							+ "\n at the door and see a pair of legs stuck in the door. On the"
							+ "\n feet are a really pretty pair of red shoes."
							+ "\n You scream and jump away from the door. You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the little people, but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 111 for choice 1, or type 112 for choice 2. Which do you choose?";

							//57
							//29, if
							prompt57 =
  							  "\n You keep asking her, but then stop... You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the \"munchkins\", but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 113 for choice 1, or type 114 for choice 2. Which do you choose?";

							//58
							//29, else
							prompt58 =
							  "\n You keep asking her, but then stop... You somehow know that this"
			                + "\n person is a witch, and you killed her... somehow. You turn and"
			                + "\n talk to the woman and the \"munchkins\", but then you hear a very"
			                + "\n loud pop behind you. You turn around and see a woman stading behind"
			                + "\n you, she runs towards the legs and reaches for the shoes."
			                + "\n She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 115 for choice 1, or type 116 for choice 2. Which do you choose?";

							//59
							//30, if
							prompt59 =
							  "\n You run past her into the woods, but you are stopped when you hear"
							+ "\n a loud pop behind you. You turn around and see another woman stading"
			                + "\n behind you. Behind her, you see a pair of legs. The other half of the"
			                + "\n body is covered by trees. You somehow know that this is a witch, and"
			                + "\n you killed her. The ugly woman runs towards the legs and reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 117 for choice 1, or type 118 for choice 2. Which do you choose?";

							//60
							//30, else
							prompt60 =
							  "\n You turn around and see a pair of legs. The other half of the"
			                + "\n body is covered by trees. You somehow know that this is a witch, and"
			                + "\n you killed her. On the witch's feet are a beautiful pair of red shoes."
			                + "\n There's a loud pop behind you, you look behind"
			                + "\n you and see a really, really ugly woman standing there. She looks at"
			                + "\n the witch on the ground, and runs towards the legs. She reaches for"
			                + "\n the shoes. She reaches out for the dead lady's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 119 for choice 1, or type 120 for choice 2. Which do you choose?";

							//61
							//31, if
							prompt61 =
							  "\n You watch the bubble float towards you, and land. Once it's on the"
							+ "\n ground, it starts to dissolve. Inside the bubble is a really pretty"
							+ "\n woman in a huge dress! She greets you, and you smile back. You"
							+ "\n blink and everything around you has changed. Under your feet are 2"
							+ "\n yellow and red winding brick roads. All around the woman, a whole"
							+ "\n bunch of little tiny people have appeared all around her. She"
							+ "\n smiles at you and asks you \"what kind of witch you are\" she waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
							+ "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
							+ "\n to the legs you were staring at. You somehow know that this is a witch, and"
							+ "\n you killed her. There's a loud pop behind you, you look behind"
							+ "\n you and see a really, really ugly woman standing there. She looks at"
							+ "\n the witch on the ground, and runs towards the legs. She reaches for"
							+ "\n the shoes. She reaches out for the dead witch's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 121 for choice 1, or type 122 for choice 2. Which do you choose?";

							//62
							//31, else
							prompt62 =
							  "\n You continue to stare at the shoes when the bubble starts to"
							+ "\n dissolve and then in front of you there's a lady in a huge"
							+ "\n dress staring at you.She greets you, and you smile back. You"
						    + "\n blink and everything around you has changed. Under your feet are 2"
						    + "\n yellow and red winding brick roads. All around the woman, a whole"
						    + "\n bunch of little tiny people have appeared all around her. She"
						    + "\n smiles at you and asks you \"what kind of witch you are\" she waits a minute"
						    + "\n for you to answer, but then gives up when she sees how confused you are because she says"
						    + "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
						    + "\n to the legs you were staring at. You somehow know that this is a witch, and"
						    + "\n you killed her. There's a loud pop behind you, you look behind"
						    + "\n you and see a really, really ugly woman standing there. She looks at"
						    + "\n the witch on the ground, and runs towards the legs. She reaches for"
						    + "\n the shoes. She reaches out for the dead witch's"
						    + "\n shoes, but as soon as she touches them, they pop onto your"
						    + "\n feet! She points her long creepy staff thing at you"
						    + "\n and the other lady, and says that she will get you"
						    + "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
						    + "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 123 for choice 1, or type 124 for choice 2. Which do you choose?";

							//63
							//32, if
							prompt63 =
							  "\n You watch the bubble float towards you, and land. Once it's on the"
							+ "\n ground, it starts to dissolve. Inside the bubble is a really pretty"
							+ "\n woman in a huge dress! She greets you, and you smile back. You"
							+ "\n blink and everything around you has changed. Under your feet are 2"
							+ "\n yellow and red winding brick roads. All around the woman, a whole"
							+ "\n bunch of little tiny people have appeared all around her. She"
							+ "\n smiles at you and asks you \"what kind of witch you are\" she waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
							+ "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
							+ "\n to the legs you were staring at. You somehow know that this is a witch, and"
							+ "\n you killed her. There's a loud pop behind you, you look behind"
							+ "\n you and see a really, really ugly woman standing there. She looks at"
							+ "\n the witch on the ground, and runs towards the legs. She reaches for"
							+ "\n the shoes. She reaches out for the dead witch's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 125 for choice 1, or type 126 for choice 2. Which do you choose?";

							//64
							//32, else
							prompt64 =
							  "\n You choose to run in a different direction, and I believe you really"
							+ "\n meant that, but you choose to watch the bubble. I mean that makes"
							+ "\n sense, it's a huge bubble!"
							+ "\n You watch the bubble float towards you, and land. Once it's on the"
							+ "\n ground, it starts to dissolve. Inside the bubble is a really pretty"
							+ "\n woman in a huge dress! She greets you, and you smile back. You"
							+ "\n blink and everything around you has changed. Under your feet are 2"
							+ "\n yellow and red winding brick roads. All around the woman, a whole"
							+ "\n bunch of little tiny people have appeared all around her. She"
							+ "\n smiles at you and asks you \"what kind of witch you are\" she waits a minute"
							+ "\n for you to answer, but then gives up when she sees how confused you are because she says"
							+ "\n says never mind, she and the \"munchkins\" are grateful for killing the witch. They point"
							+ "\n to the legs you were staring at. You somehow know that this is a witch, and"
							+ "\n you killed her. There's a loud pop behind you, you look behind"
							+ "\n you and see a really, really ugly woman standing there. She looks at"
							+ "\n the witch on the ground, and runs towards the legs. She reaches for"
							+ "\n the shoes. She reaches out for the dead witch's"
							+ "\n shoes, but as soon as she touches them, they pop onto your"
							+ "\n feet! She points her long creepy staff thing at you"
							+ "\n and the other lady, and says that she will get you"
							+ "\n Then the ugly woman leaves in a puff of air. (Choice 1) Run"
							+ "\n away! (Choice 2) Stay and talk to the pretty woman."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 127 for choice 1, or type 128 for choice 2. Which do you choose?";


																	//math for choice 2, #1
								        if (userAnswer == 1)
								        	{
								        	System.out.println(prompt1);
											userAnswer = in.nextDouble();

								        		}

										//math for choice 2, #2
									    else if (userAnswer == 2)
									    	{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 3)
											{
											System.out.println(prompt3);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 4)
											{
											System.out.println(prompt4);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 5)
											{
											System.out.println(prompt5);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 6)
											{
											System.out.println(prompt6);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 7)
											{
											System.out.println(prompt7);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 8)
											{
											System.out.println(prompt8);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 9)
											{
											System.out.println(prompt9);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 10)
											{
											System.out.println(prompt10);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 11)
											{
											System.out.println(prompt11);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 12)
											{
											System.out.println(prompt12);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 13)
											{
											System.out.println(prompt13);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 14)
											{
											System.out.println(prompt14);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer ==15)
											{
											System.out.println(prompt15);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 16)
											{
											System.out.println(prompt16);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
								        if (userAnswer == 17)
								        	{
								        	System.out.println(prompt17);
											userAnswer = in.nextDouble();

								        }

										//math for choice 2, #2
									    else if (userAnswer == 18)
									    	{
											System.out.println(prompt18);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 19)
											{
											System.out.println(prompt19);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 20)
											{
											System.out.println(prompt20);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										if (userAnswer == 21)
											{
											System.out.println(prompt21);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 22)
											{
											System.out.println(prompt22);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 23)
											{
											System.out.println(prompt23);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 24)
											{
											System.out.println(prompt24);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 25)
											{
											System.out.println(prompt25);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 26)
											{
											System.out.println(prompt26);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 27)
											{
											System.out.println(prompt11);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 28)
											{
											System.out.println(prompt28);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										if (userAnswer == 29)
											{
											System.out.println(prompt29);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 30)
											{
											System.out.println(prompt30);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 31)
											{
											System.out.println(prompt31);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 32)
											{
											System.out.println(prompt32);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
								        if (userAnswer == 33)
								        	{
								        	System.out.println(prompt33);
											userAnswer = in.nextDouble();

								        		}

										//math for choice 2, #2
									    else if (userAnswer == 34)
									    	{
											System.out.println(prompt34);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 35)
											{
											System.out.println(prompt35);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 36)
											{
											System.out.println(prompt36);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 37)
											{
											System.out.println(prompt37);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 38)
											{
											System.out.println(prompt38);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 39)
											{
											System.out.println(prompt39);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 40)
											{
											System.out.println(prompt40);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 41)
											{
											System.out.println(prompt41);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 42)
											{
											System.out.println(prompt42);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 43)
											{
											System.out.println(prompt43);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 44)
											{
											System.out.println(prompt44);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										else if (userAnswer == 45)
											{
											System.out.println(prompt45);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 46)
											{
											System.out.println(prompt46);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 47)
											{
											System.out.println(prompt47);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 48)
											{
											System.out.println(prompt48);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
								        if (userAnswer == 49)
								        	{
								        	System.out.println(prompt49);
											userAnswer = in.nextDouble();

								        }

										//math for choice 2, #2
									    else if (userAnswer == 50)
									    	{
											System.out.println(prompt50);
											userAnswer = in.nextDouble();

									        	}
										//math for choice 2, #3
										else if (userAnswer == 51)
											{
											System.out.println(prompt51);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 52)
											{
											System.out.println(prompt52);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										if (userAnswer == 53)
											{
											System.out.println(prompt53);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 54)
											{
											System.out.println(prompt54);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 55)
											{
											System.out.println(prompt55);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 56)
											{
											System.out.println(prompt56);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #1
										else if (userAnswer == 57)
											{
											System.out.println(prompt57);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 58)
											{
											System.out.println(prompt58);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 59)
											{
											System.out.println(prompt59);
											userAnswer = in.nextDouble();

												 }

										//math for choice 2, #4
										else if (userAnswer == 60)
											{
											System.out.println(prompt60);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #1
										if (userAnswer == 61)
											{
											System.out.println(prompt61);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #2
										else if (userAnswer == 62)
											{
											System.out.println(prompt62);
											userAnswer = in.nextDouble();

												}
										//math for choice 2, #3
										else if (userAnswer == 63)
											{
											System.out.println(prompt63);
											userAnswer = in.nextDouble();

												}

										//math for choice 2, #4
										else if (userAnswer == 64)
											{
											System.out.println(prompt64);
											userAnswer = in.nextDouble();

												}



							//1
							//1, if
							prompt1 =
							  " \n You run away, but before you get far, the lady and the little"
							+ " \n people ask you if you want to go home. YOu stop dead in your"
							+ " \n tracks and look at them. Going home is the only thing that"
							+ " \n you want. They tell you that the \"Wizard of Oz\" can help"
							+ " \n you get home. You ask them how to get to this\"wizard\""
							+ " \n They all look at each other and grin. One steps up to you"
							+ " \n and says \"follow the yellow brick road!\" You look down,"
							+ " \n and find the yellow road. You start walking, telling"
							+ " \n yourself to \"follow the yellow brick road.\" They all"
							+ " \n start singing follow the yellow brick road. You walk"
							+ " \n along that path for a long time, when you come across a"
							+ " \n fork in the road. You stand there for a minute wondering"
							+ " \n aloud which way to go. You hear a voice from the field"
							+ " \n that you are standing next to. The voice says \"that way"
							+ " \n seems nice!\" You look, and all you see is a scarecrow"
							+ " \n pointing to the right. You"
							+ " \n know that the scarecrow can't talk! You keep looking for the"
							+ " \n voice, when it says \"or that way...\" You could have sworn"
							+ " \n it was coming from the scarecrow! You look back at him,"
							+ " \n and see him now pointing to the left! You walk up to the"
							+ " \n scarecrow and ask him if he said something. He starts to giggle"
							+ " \n He shakes his head no, but laughs even harder while he shakes"
							+ " \n his head yes. He says that he has no brain and he really"
							+ " \n wants to get down off the pole that he has been strapped to his"
							+ " \n whole life. You help him down, and he thanks you. He says"
							+ " \n that he really wants a brain. You think for a minute, and"
							+ " \n then tell him that you are going to the Wizard of Oz to get"
							+ " \n back to B hall. You tell him that he is welcome to join you"
							+ " \n if he wants. He accepts, and you guys continue on your way."
							+ "	\n			     		..............."
							+ " \n You have been walking for a long time, when you come across"
							+ " \n an apple tree. (Choice 1) Eat an apple (Choice 2) don't"
							+ " \n eat an apple and keep walking."
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  " \n You are talking to the woman, and the little munchkin/people"
							+ " \n and you mention that you really want to go home, because"
							+ " \n you are exhausted! They look at each and say that you need"
							+ " \n to go see The Wizard of Oz! They tell you that the Wizard of Oz"
							+ " \n can help you get home. You ask them how to get to this\"wizard\""
							+ " \n They all look at each other and grin. One steps up to you"
							+ " \n and says \"follow the yellow brick road!\" You look down,"
							+ " \n and find the yellow road. You start walking, telling"
							+ " \n yourself to \"follow the yellow brick road.\" They all"
							+ " \n start singing follow the yellow brick road. You walk"
							+ " \n along that path for a long time, when you come across a"
							+ " \n fork in the road. You stand there for a minute wondering"
							+ " \n aloud which way to go. You hear a voice from the field"
							+ " \n that you are standing next to. The voice says \"that way"
							+ " \n seems nice!\" You look, and all you see is a scarecrow"
							+ " \n pointing to the right. You"
							+ " \n know that the scarecrow can't talk! You keep looking for the"
							+ " \n voice, when it says \"or that way...\" You could have sworn"
							+ " \n it was coming from the scarecrow! You look back at him,"
							+ " \n and see him now pointing to the left! You walk up to the"
							+ " \n scarecrow and ask him if he said something. He starts to giggle"
							+ " \n He shakes his head no, but laughs even harder while he shakes"
							+ " \n his head yes. He says that he has no brain and he really"
							+ " \n wants to get down off the pole that he has been strapped to his"
							+ " \n whole life. You help him down, and he thanks you. He says"
							+ " \n that he really wants a brain. You think for a minute, and"
							+ " \n then tell him that you are going to the Wizard of Oz to get"
							+ " \n back to B hall. You tell him that he is welcome to join you"
							+ " \n if he wants. He accepts, and you guys continue on your way."
							+ "	\n			     		..............."
							+ " \n You have been walking for a long time, when you come across"
							+ " \n an apple tree. (Choice 1) Eat an apple (Choice 2) don't"
							+ " \n eat an apple and keep walking."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

											if (userAnswer % 2 != 0)
											{
												System.out.println(prompt1);
												userAnswer = in.nextDouble();

											}

											else if (userAnswer % 2 == 0)
											{
												System.out.println(prompt2);
												userAnswer = in.nextDouble();

											}

							//1
							//1, if
							prompt1 =
							  " \n You grab an apple, but once it gets in your hand, the"
							+ " \n apple tree knocks the apple out of your hand. You are"
							+ " \n shocked that the tree would do that! Why couldn't"
							+ " \n you have an apple? The tree says \"how would you"
							+ " \n feel if I came and started picking things off of"
							+ " \n you?\" You think about this for a second, then"
							+ " \n realize the tree is talking! And grabbing things"
							+ " \n from you! You gasp, realizing you are no longer"
							+ " \n in B hall at all! You and the scarecrow back up"
							+ " \n and he says that he has a plan. He puts his arm"
							+ " \n around you, and looks at the tree. He tells the trees"
							+ " \n that you wouldn't want their apples, they have worms!"
							+ " \n The trees are very angry, and they start throwing"
							+ " \n the apples. The scarecrow keeps jeering at them,"
							+ " \n and insulting them. You scramble to pick up the"
							+ " \n apples as they throw them. You guys keep walking"
							+ " \n with all the apples you could possibly imagine!"
							+ " \n You laugh and eat them as you walk. You are walking"
							+ " \n along the path, and you drop an apple out of your"
							+ " \n pocket. You watch it roll into the bushes, and then"
							+ " \n go get it. You bend down to grab the apple, but"
							+ " \n then you see something shiny and tall next to the"
							+ " \n apple on the ground. You follow it up to the top"
							+ " \n and you find a man at the top! He is a tin man!"
							+ " \n You and the scarecrow start dusting him off and"
							+ " \n try to find a way to fix him. He is completely"
							+ " \n frozen to the spot. The tin man  mutters something"
							+ " \n and you lean in to hear him. He says \"oil\" You"
							+ " \n and the scarecrow find the oil and put it on him."
							+ " \n He thanks you, and you guys talk to him for a"
							+ " \n while, and he tells you how sad he is that he doesn't"
							+ " \n have a heart. (Choice 1) Let him come with you to"
							+ " \n see the wizard, (Choice 2) Say goodbye, and walk away."
							+ "\n ------------------------------------------------------------------"
							+ "\n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							"\n You keep walking, but the scarecrow begs you to get one."
							+ "\n you say no at first, because you really have to get"
							+ "\n to get back to B hall, but after he begs you for a"
							+ "\n really long time, you realize how hungry you really are."
							+ " \n You grab an apple, but once it gets in your hand, the"
							+ " \n apple tree knocks the apple out of your hand. You are"
							+ " \n shocked that the tree would do that! Why couldn't"
							+ " \n you have an apple? The tree says \"how would you"
							+ " \n feel if I came and started picking things off of"
							+ " \n you?\" You think about this for a second, then"
							+ " \n realize the tree is talking! And grabbing things"
							+ " \n from you! You gasp, realizing you are no longer"
							+ " \n in B hall at all! You and the scarecrow back up"
							+ " \n and he says that he has a plan. He puts his arm"
							+ " \n around you, and looks at the tree. He tells the trees"
							+ " \n that you wouldn't want their apples, they have worms!"
							+ " \n The trees are very angry, and they start throwing"
							+ " \n the apples. The scarecrow keeps jeering at them,"
							+ " \n and insulting them. You scramble to pick up the"
							+ " \n apples as they throw them. You guys keep walking"
							+ " \n with all the apples you could possibly imagine!"
							+ " \n You laugh and eat them as you walk. You are walking"
							+ " \n along the path, and you drop an apple out of your"
							+ " \n pocket. You watch it roll into the bushes, and then"
							+ " \n go get it. You bend down to grab the apple, but"
							+ " \n then you see something shiny and tall next to the"
							+ " \n apple on the ground. You follow it up to the top"
							+ " \n and you find a man at the top! He is a tin man!"
							+ " \n You and the scarecrow start dusting him off and"
							+ " \n try to find a way to fix him. He is completely"
							+ " \n frozen to the spot. The tin man  mutters something"
							+ " \n and you lean in to hear him. He says \"oil\" You"
							+ " \n and the scarecrow find the oil and put it on him."
							+ " \n He thanks you, and you guys talk to him for a"
							+ " \n while, and he tells you how sad he is that he doesn't"
							+ " \n have a heart. (Choice 1) Let him come with you to"
							+ " \n see the wizard, (Choice 2) Say goodbye, and walk away."
							+ " \n -----------------------------------------------------------------"
							+ " \n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";


											if (userAnswer % 2 != 0)
											{
												System.out.println(prompt1);
												userAnswer = in.nextDouble();

											}

											else if (userAnswer % 2 == 0)
											{
												System.out.println(prompt2);
												userAnswer = in.nextDouble();

											}


							//1
							//1, if
							prompt1 =
							  " \n You tell the Tin Man about your plan to see the"
							+ " \n wizard, you tell him that he can come with you"
							+ " \n and the scarecrow if he wants he gets very"
							+ " \n excited and he says that he would love to. "
							+ " \n The three of you keep walking for a while, but"
							+ " \n then the wicked ugly witch that tried to take"
							+ " \n the shoes shows up and says that no matter how"
							+ " \n much help you get from your friends, she will"
							+ " \n kill you one way or another. The scarecrow steps"
							+ " \n forward and says that he will protect you. The tin"
							+ " \n man steps up and does the same. You feel really"
							+ " \n touched. The tin man runs towards the witch,"
							+ " \n but she's gone by the time he gets to her."
							+ " \n You guys keep walking, but you stop when you"
							+ " \n get to a really scary part of the forest that you"
							+ " \n have been walking in. You hear a noise, and then"
							+ " \n another one, and you guys are really scared."
							+ " \n A lion jumps out of the woods onto the path, and"
							+ " \n tries to scare you guys. The scarecrow sees right"
							+ " \n through it, and shouts \"BOO!\" at the lion. The"
							+ " \n lion shakes with fear. All three of you talk to"
							+ " \n him, like you did with The Tin Man, and learn"
							+ " \n that he was trying really hard to scare you guys,"
							+ " \n but he has no courage. You think about inviting"
							+ " \n him along, but then again, he could cause you"
							+ " \n a lot of problems... (Choice 1) Invite him."
							+ " \n (Choice 2) Don't invite him."
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  "\n You are walking away when the scarecrow stops you."
							+ "\n He says he doesn't have a brain, but he does have"
							+ "\n a heart, and we should let the tin man come with us. "
							+ "\n You think about that for a while, and decide he's"
							+ "\n  right. You guys turn back, you tell the Tin Man"
			  				+ " \n about your plan to see the"
							+ " \n wizard, you tell him that he can come with you"
							+ " \n and the scarecrow if he wants he gets very"
							+ " \n excited and he says that he would love to. "
							+ " \n The three of you keep walking for a while, but"
							+ " \n then the wicked ugly witch that tried to take"
							+ " \n the shoes shows up and says that no matter how"
							+ " \n much help you get from your friends, she will"
							+ " \n kill you one way or another. The scarecrow steps"
							+ " \n forward and says that he will protect you. The tin"
							+ " \n man steps up and does the same. You feel really"
							+ " \n touched. The tin man runs towards the witch,"
							+ " \n but she's gone by the time he gets to her."
							+ " \n You guys keep walking, but you stop when you"
							+ " \n get to a really scary part of the forest that you"
							+ " \n have been walking in. You hear a noise, and then"
							+ " \n another one, and you guys are really scared."
							+ " \n A lion jumps out of the woods onto the path, and"
							+ " \n tries to scare you guys. The scarecrow sees right"
							+ " \n through it, and shouts \"BOO!\" at the lion. The"
							+ " \n lion shakes with fear. All three of you talk to"
							+ " \n him, like you did with The Tin Man, and learn"
							+ " \n that he was trying really hard to scare you guys,"
							+ " \n but he has no courage. You think about inviting"
							+ " \n him along, but then again, he could cause you"
							+ " \n a lot of problems... (Choice 1) Invite him."
							+ " \n (Choice 2) Don't invite him."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

											if (userAnswer % 2 != 0)
											{
												System.out.println(prompt1);
												userAnswer = in.nextDouble();

											}

											else if (userAnswer % 2 == 0)
											{
												System.out.println(prompt2);
												userAnswer = in.nextDouble();

											}

							//1
							//1, if
							prompt1 =
							  " \n The explain that you are going to see the"
							+ " \n wizard and you want him to come along to get"
							+ " \n some courage. He jumps up and down, he is so"
							+ " \n excited. You three go on your way, you walk"
							+ " \n for what feels like days, and then you see"
							+ " \n a gorgeous field of flowers. You four run"
							+ " \n into the field and smell the flowers, and "
							+ " \n enjoy being here with your friends. While you"
							+ " \n are in the field, you start to get very tired,"
							+ " \n and you lay down in the field. You can hear"
							+ " \n your friends yelling and screaming for help,"
							+ " \n They get very quiet, and then you hear a "
							+ " \n woman's voice, then it starts snowing, then"
							+ " \n you wake up. You get up, and you and your friends"
							+ " \n look around. You look north, and see Emerald City!"
							+ " \n On the sign it says \"Home of the Wizard of Oz\""
							+ " \n You guys start running to the city, down the"
							+ " \n yellow brick road. You guys run all the way to"
							+ " \n a very large door at the entrance of Emerald"
							+ " \n city. You ring the bell, and a head pops out"
							+ " \n of the top of the door, and tells you to knock."
							+ " \n you knock on the door and the guy then asks"
							+ " \n you what you want. You tell him that you"
							+ " \n would like to see the wizard. He tells you"
							+ " \n that no one has ever seen the wizard! He"
							+ " \n seems baffled that you would request that."
							+ " \n You tell him how urgent it is for you to see"
						    + " \n the wizard. You tell him that the lady from"
							+ " \n the little people land sent you. He says \"prove"
							+ " \n it.\" Your friends jump in and tell him you're"
							+ " \n wearing the shoes that the lady gave you. He"
							+ " \n looks at your shoes and asks you why you didn't"
							+ " \n tell him that in the first place! He opens the"
							+ " \n doors, and lets you go in. (Choice 1) go in"
							+ " \n (Choice 2) don't go in"
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  "\n Again, the scarecrow stops you, and says that the"
							+ "\n lion is welcome to go with you guys, and if you"
							+ "\n don't invite him, than the scarecrow will. The"
							+ "\n tin man stays quiet, I mean he doesn't have a"
							+ "\n  heart... So. You again think for a second, and"
							+ " \n turn around, to invite the lion."
							+ " \n The explain that you are going to see the"
							+ " \n wizard and you want him to come along to get"
							+ " \n some courage. He jumps up and down, he is so"
							+ " \n excited. You three go on your way, you walk"
							+ " \n for what feels like days, and then you see"
							+ " \n a gorgeous field of flowers. You four run"
							+ " \n into the field and smell the flowers, and "
							+ " \n enjoy being here with your friends. While you"
							+ " \n are in the field, you start to get very tired,"
							+ " \n and you lay down in the field. You can hear"
							+ " \n your friends yelling and screaming for help,"
							+ " \n They get very quiet, and then you hear a "
							+ " \n woman's voice, then it starts snowing, then"
							+ " \n you wake up. You get up, and you and your friends"
							+ " \n look around. You look north, and see Emerald City!"
							+ " \n On the sign it says \"Home of the Wizard of Oz\""
							+ " \n You guys start running to the city, down the"
							+ " \n yellow brick road. You guys run all the way to"
							+ " \n a very large door at the entrance of Emerald"
							+ " \n city. You ring the bell, and a head pops out"
							+ " \n of the top of the door, and tells you to knock."
							+ " \n you knock on the door and the guy then asks"
							+ " \n you what you want. You tell him that you"
							+ " \n would like to see the wizard. He tells you"
							+ " \n that no one has ever seen the wizard! He"
							+ " \n seems baffled that you would request that."
							+ " \n You tell him how urgent it is for you to see"
							+ " \n the wizard. You tell him that the lady from"
							+ " \n the little people land sent you. He says \"prove"
							+ " \n it.\" Your friends jump in and tell him you're"
							+ " \n wearing the shoes that the lady gave you. He"
							+ " \n looks at your shoes and asks you why you didn't"
							+ " \n tell him that in the first place! He opens the"
							+ " \n doors, and lets you go in. (Choice 1) go in"
							+ " \n (Choice 2) don't go in"
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

											if (userAnswer % 2 != 0)
											{
												System.out.println(prompt1);
												userAnswer = in.nextDouble();

											}

											else if (userAnswer % 2 == 0)
											{
												System.out.println(prompt2);
												userAnswer = in.nextDouble();

											}

							//1
							//1, if
							prompt1 =
							  " \n You step into Emerald City, and see a whole"
							+ " \n bunch of people, they treat you kinda like"
							+ " \n the munchkins did. They start singing, while"
							+ " \n they wash you, and feed you. They then send"
							+ " \n you down a long hallway that seems to get"
							+ " \n creepier the longer you walk. It seems to"
							+ " \n go on forever, but you finally get to some"
							+ " \n sort of den. There's a bunch of green smoke"
							+ " \n and a creepy voice that asks you what you"
							+ " \n want. You tell the voice that you want to"
							+ " \n get back to B hall. You don't know where you are,"
							+ " \n and you want to go back to B hall. Each of"
							+ " \n your friends in turn tell the Wizard what they"
							+ " \n want. He tells you that in order to go home,"
							+ " \n you have to get a tree to willingly give you"
							+ " \n an apple. He then tells you guys to get lost."
							+ " \n The lion runs as fast as he can, while the"
							+ " \n scarecrow, and the Tin Man ask him about"
							+ " \n their wishes. He gets very angry, and tells"
							+ " \n you guys to leave. The rest of you leave, and"
							+ " \n walk out of Emerald City. You guys stand there"
							+ " \n for a bit, and then you start walking towards"
							+ " \n where the trees were, back down the yellow"
							+ " \n brick road. You guys again, walk for what"
							+ " \n seems like forever, and finally get to where"
							+ " \n the trees were. The key word is were, you look"
							+ " \n around, and see no trees! There's no apples"
							+ " \n anywhere!! You don't know what to do. You could"
							+ " \n have sworn the trees were here! (Choice 1) start"
							+ " \n screaming, and maybe the nice lady will come and"
							+ " \n help you guys again. (Choice 2) keep walking,"
							+ " \n maybe the trees were further down."
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  "\n You are really happy you invite all of them,"
							+ "\n because they drag you inside the doors, telling"
							+ "\n you that they have come so far and they can't"
							+ "\n give up now! You smile at them and thank them."
							+ " \n You step into Emerald City, and see a whole"
							+ " \n bunch of people, they treat you kinda like"
							+ " \n the munchkins did. They start singing, while"
							+ " \n they wash you, and feed you. They then send"
							+ " \n you down a long hallway that seems to get"
							+ " \n creepier the longer you walk. It seems to"
							+ " \n go on forever, but you finally get to some"
							+ " \n sort of den. There's a bunch of green smoke"
							+ " \n and a creepy voice that asks you what you"
							+ " \n want. You tell the voice that you want to"
							+ " \n know how to get home. You don't know where you"
							+ " \n are, but you really want to get back to B hall."
							  + " \n and you want to go back to B hall. Each of"
							  + " \n your friends in turn tell the Wizard what they"
							  + " \n want. He tells you that in order to go home,"
							  + " \n you have to get a tree to willingly give you"
							  + " \n an apple. He then tells you guys to get lost."
							  + " \n The lion runs as fast as he can, while the"
							  + " \n scarecrow, and the Tin Man ask him about"
							  + " \n their wishes. He gets very angry, and tells"
							  + " \n you guys to leave. The rest of you leave, and"
							  + " \n walk out of Emerald City. You guys stand there"
							  + " \n for a bit, and then you start walking towards"
							  + " \n where the trees were, back down the yellow"
							  + " \n brick road. You guys again, walk for what"
							  + " \n seems like forever, and finally get to where"
							  + " \n the trees were. The key word is were, you look"
							  + " \n around, and see no trees! There's no apples"
							  + " \n anywhere!! You don't know what to do. You could"
							  + " \n have sworn the trees were here! (Choice 1) start"
							  + " \n screaming, and maybe the nice lady will come and"
							  + " \n help you guys again. (Choice 2) keep walking,"
							  + " \n maybe the trees were further down."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

										if (userAnswer % 2 != 0)
										{
											System.out.println(prompt1);
											userAnswer = in.nextDouble();

										}

										else if (userAnswer % 2 == 0)
										{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

										}

							//1
							//1, if
							prompt1 =
							  "\n You start yelling, and the woman shows up! She"
							+ "\n confirms what you already expected. This is the"
							+ "\n work of the Witch. She says that all you need to"
							+ "\n do is shut your eyes, and imagine the trees in"
							+ " \n front of you. You close your eyes, and think"
							+ " \n really hard. You see the trees in your mind,"
							+ " \n you imagine the trees handing you an abundance"
							+ " \n of apples, you really visualize this happening,"
							+ " \n and then you open yor eyes. You look around"
							+ " \n you and see a forest. You see SO MANY trees!"
							+ " \n  They are glaring at you, probably still very"
							+ " \n upset about what happened earlier... You"
							+ " \n step forward, and tell the trees what's going"
							+ " \n on. You tell them that you really want to go"
							+ " \n home. The trees tell you that they don't want"
							+ " \n to help you, because you probably have worms."
							+ " \n Then they stop talking, and moving and doing"
							+ " \n anything. At first, you and your friends think"
							+ " \n that it's because the trees are mad at you, but"
							+ " \n even when you beg, you get no response. You"
							+ " \n run up to one of the trees, and hug it. You"
							+ " \n feel tears running down your face, dropping"
							+ " \n onto the trees. You feel helpless. This was"
							+ " \n your only hope to get back to B hall. You cry, and cry,"
							+ " \n and feel your friends try to comfort you. They"
							+ " \n try to pull you off the tree, but you cling to"
							+ " \n it, willing it to come back to life, to help"
							+ " \n you. You have almost completely soaked the"
							+ " \n roots of the tree under you, when you feel the"
							+ " \n tree sway. You jump back, worried that it's"
							+ " \n going to fall over. The tree looks at you, and"
							+ " \n says that you saved him. The Witch had put a spell"
							+ " \n on him, and he couldn't move. He leans down, so"
							+ " \n his leaves are level with your face. He tells you"
							+ " \n to take an apple. He says that you can come back"
							+ " \n anytime you want. You take an apple, and start"
							+ " \n crying again. (Choice 1) take a nap (Choice 2)"
							+ " \n Go back to the wizard"
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  "\n You walk for at least another mile, and everyone"
							+ "\n is tired, and cranky. They stop you, and tell you"
							+ "\n that this is stupid. You knew that the trees were"
							+ "\n supposed to be back there, and you need to go back."
							+ " \n You think about it for a while, but your friends"
							+ " \n are very impatient. "
							+ "\n They start yelling, and the woman shows up, she"
							+ "\n confirms what you already expected. This is the"
							+ "\n work of the Witch. She says that all you need to"
							+ "\n do is shut your eyes, and imagine the trees in"
							+ " \n front of you. You close your eyes, and think"
							+ " \n really hard. You see the trees in your mind,"
							+ " \n you imagine the trees handing you an abundance"
							+ " \n of apples, you really visualize this happening,"
							+ " \n and then you open yor eyes. You look around"
							+ " \n you and see a forest. You see SO MANY trees!"
							+ " \n  They are glaring at you, probably still very"
							+ " \n upset about what happened earlier... You"
							+ " \n step forward, and tell the trees what's going"
							+ " \n on. You tell them that you really want to go"
							+ " \n home. The trees tell you that they don't want"
							+ " \n to help you, because you probably have worms."
							+ " \n Then they stop talking, and moving and doing"
							+ " \n anything. At first, you and your friends think"
							+ " \n that it's because the trees are mad at you, but"
							+ " \n even when you beg, you get no response. You"
							+ " \n run up to one of the trees, and hug it. You"
							+ " \n feel tears running down your face, dropping"
							+ " \n onto the trees. You feel helpless. This was"
							+ " \n your only hope to get home. You cry, and cry,"
							+ " \n and feel your friends try to comfort you. They"
							+ " \n try to pull you off the tree, but you cling to"
							+ " \n it, willing it to come back to life, to help"
							+ " \n you. You have almost completely soaked the"
							+ " \n roots of the tree under you, when you feel the"
							+ " \n tree sway. You jump back, worried that it's"
							+ " \n going to fall over. The tree looks at you, and"
							+ " \n says that you saved him. The Witch had put a spell"
							+ " \n on him, and he couldn't move. He leans down, so"
							+ " \n his leaves are level with your face. He tells you"
							+ " \n to take an apple. He says that you can come back"
							+ " \n anytime you want. You take an apple, and start"
							+ " \n crying again. (Choice 1) take a nap (Choice 2)"
							+ " \n Go back to the wizard"
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

										if (userAnswer % 2 != 0)
										{
											System.out.println(prompt1);
											userAnswer = in.nextDouble();

										}

										else if (userAnswer % 2 == 0)
										{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

										}

							//1
							//1, if
							prompt1 =
							  "\n You lay down, and realize how extremely tired you"
							+ "\n are. You know that you really should get up and go"
							+ "\n talk to the Wizard, but you can't help how tired"
							+ "\n you are. You can hear your friends debating whether"
							+ " \n they should wake you up, or let you sleep. You"
							+ " \n start thinking about how much you really need to"
							+ " \n get up, you really need to get back to B hall."
							+ " \n you try to get up, but you can't. You feel your"
							+ " \n mind drift into unconsciousness, but you try to"
							+ " \n fight it. You try really hard, and then right"
							+ " \n before you pass out, you know this was the Witch."
							+ " \n You really hope your friends will figure it out,"
							+ " \n and take you to the Wizard."
							+ "	\n			     ..............."
							+ " \n You feel yourself being dragged across the "
							+ " \n road. You wake up, and look as the Tin Man,"
							+ " \n and the lion pull you into Emerald City. The"
							+ " \n people there gasp when they see you. They put"
							+ " \n you all in big comfy chairs, and fan the lion"
							+ " \n and the Tin Man. The scarecrow says that he was"
							+ " \n too weak to carry you. They get you a new outfit"
							+ " \n because the back of the one you're wearing is"
							+ " \n pretty torn up from being dragged down the "
							+ " \n yellow brick road. (Choice 1) Rest there"
							+ " \n (Choice 2) Get them up, and get back to B hall."
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  "\n  You were going to back to the Wizard, but you are so"
							+ "\n exhausted, You lay down, and realize how extremely tired you"
							+ "\n are. You know that you really should get up and go"
							+ "\n talk to the Wizard, but you can't help how tired"
							+ "\n you are. You can hear your friends debating whether"
							+ " \n they should wake you up, or let you sleep. You"
							+ " \n start thinking about how much you really need to"
							+ " \n get up, you really need to get back to B hall."
							+ " \n you try to get up, but you can't. You feel your"
							+ " \n mind drift into unconsciousness, but you try to"
							+ " \n fight it. You try really hard, and then right"
							+ " \n before you pass out, you know this was the Witch."
							+ " \n You really hope your friends will figure it out,"
							+ " \n and take you to the Wizard."
							+ "	\n			     ..............."
							+ " \n You feel yourself being dragged across the "
							+ " \n road. You wake up, and look as the Tin Man,"
							+ " \n and the lion pull you into Emerald City. The"
							+ " \n people there gasp when they see you. They put"
							+ " \n you all in big comfy chairs, and fan the lion"
							+ " \n and the Tin Man. The scarecrow says that he was"
							+ " \n too weak to carry you. They get you a new outfit"
							+ " \n because the back of the one you're wearing is"
							+ " \n pretty torn up from being dragged down the "
							+ " \n yellow brick road. (Choice 1) Rest there"
							+ " \n (Choice 2) Get them up, and get back to B hall."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";

										if (userAnswer % 2 != 0)
										{
											System.out.println(prompt1);
											userAnswer = in.nextDouble();

										}

										else if (userAnswer % 2 == 0)
										{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

										}


							//1
							//1, if
							prompt1 =
							  " \n You sit there for a while, but then one you guys"
							+ " \n get up, and stretch, and prepare to go back to the"
							+ " \n Wizard with the apple. When all four of you are "
							+ " \n ready, you walk down the same long hall, and listen"
							+ " \n to the same creepy voice. You see a curtain, off to"
							+ " \n the side that keeps shaking. The lion walks shakily"
							+ " \n over to it, and pulls it open. It reveals a man. He"
							+ " \n is pressing buttons, and controlling the creepy voice!"
							+ " \n This man is the Wizard! The lion taps him on the"
							+ " \n shoulder, and then runs away when the old man turns"
							+ " \n around. The Tin Man walks up to him, and says that"
							+ " \n the lion needs some courage! The old man turns to the"
							+ " \n lion and says \"You faced the Witch didn't you? You"
							+ "	\n just scared the poop out of me, and you have traveled"
							+ " \n all this way, not knowing what you were going to"
							+ " \n stumble upon. I'd say that is the definition of"
							+ " \n courage!\" The lion ran forward, and hugged the man."
							+ " \n He got on all fours, and roared like you never would've"
							+ " \n believed! The lion steps forward, and says that the"
							+ " \n Tin Man needs a heart! The Tin Man nods encouragingly"
							+ " \n the old man puts his arm around him, and tells him"
							+ " \n that \" indeed he does have a heart!\" He carried"
							+ " \n Dorothy all the way back to Emerald City from the"
							+ " \n forest. That is what having a heart is, doing anything"
							+ " \n for the people you love. The Tin Man cries, and says"
							+ " \n that the scarecrow needs a brain! The scarecrow comes"
							+ " \n forward, and the man asks him isn't he the one that came"
							+ " \n up with all those plans to outsmart the witch, get the"
							+ " \n apples of the tree, and things like that? The scarecrow"
							+ " \n says \"well yes!\" The man looks at all of us and says"
							+ " \n \"well that sounds like a brain to me, what about you guys?\""
							+ " \n You all nod and tell the scarecrow that he is pretty brilliant!"
							+ " \n They all three ask about you. They tell the man that you"
							+ " \n have to go back to B hall! He says that you can go back"
							+ " \n whenever you want. You already kinda did too, you just have"
							+ " \n to really want it. You grab his arm and tell him how"
							+ " \n much you want to go home. He tells you to say goodbye"
							+ " \n to your friends. You hug them one by one, and then"
							+ " \n tell them you will miss them. They say that they will miss"
							+ " \n you too, and to visit often! You turn back to the Wizard,"
							+ " \n ready to go home. He holds your hand, and tells you to"
							+ " \n tap your heels together 3 times, and say there's no"
							+ " \n place like home, 3 times. You do that, and feel yourself"
							+ " \n drift away from Oz. You wake up, and you are laying on"
							+ " \n the ground of your room in B hall. (Choice 1) Do it again"
							+ " \n (Choice 2) Don't do it again."
							+ " \n ------------------------------------------------------------------"
							+ " \n Type 1 for choice 1, and type 2 for choice 2. Which do you choose?";

							//2
							//1, else
							prompt2 =
							  " \n You walk down the same long hall, and listen"
							+ " \n to the same creepy voice. You see a curtain, off to"
							+ " \n the side that keeps shaking. The lion walks shakily"
							+ " \n over to it, and pulls it open. It reveals a man. He"
							+ " \n is pressing buttons, and controlling the creepy voice!"
							+ " \n This man is the Wizard! The lion taps him on the"
							+ " \n shoulder, and then runs away when the old man turns"
							+ " \n around. The Tin Man walks up to him, and says that"
							+ " \n the lion needs some courage! The old man turns to the"
							+ " \n lion and says \"You faced the Witch didn't you? You"
							+ "	\n just scared the poop out of me, and you have traveled"
							+ " \n all this way, not knowing what you were going to"
							+ " \n stumble upon. I'd say that is the definition of"
							+ " \n courage!\" The lion ran forward, and hugged the man."
							+ " \n He got on all fours, and roared like you never would've"
							+ " \n believed! The lion steps forward, and says that the"
							+ " \n Tin Man needs a heart! The Tin Man nods encouragingly"
							+ " \n the old man puts his arm around him, and tells him"
							+ " \n that \" indeed he does have a heart!\" He carried"
							+ " \n Dorothy all the way back to Emerald City from the"
							+ " \n forest. That is what having a heart is, doing anything"
							+ " \n for the people you love. The Tin Man cries, and says"
							+ " \n that the scarecrow needs a brain! The scarecrow comes"
							+ " \n forward, and the man asks him isn't he the one that came"
							+ " \n up with all those plans to outsmart the witch, get the"
							+ " \n apples of the tree, and things like that? The scarecrow"
							+ " \n says \"well yes!\" The man looks at all of us and says"
							+ " \n \"well that sounds like a brain to me, what about you guys?\""
							+ " \n You all nod and tell the scarecrow that he is pretty brilliant!"
							+ " \n They all three ask about you. They tell the man that you"
							+ " \n have to go back to B hall! He says that you can go back"
							+ " \n whenever you want. You already kinda did too, you just have"
							+ " \n to really want it. You grab his arm and tell him how"
							+ " \n much you want to go home. He tells you to say goodbye"
							+ " \n to your friends. You hug them one by one, and then"
							+ " \n tell them you will miss them. They say that they will miss"
							+ " \n you too, and to visit often! You turn back to the Wizard,"
							+ " \n ready to go home. He holds your hand, and tells you to"
							+ " \n tap your heels together 3 times, and say there's no"
							+ " \n place like home, 3 times. You do that, and feel yourself"
							+ " \n drift away from Oz. You wake up, and you are laying on"
							+ " \n the ground of your room in B hall. (Choice 1) Do it again"
							+ " \n (Choice 2) Don't do it again."
							+ "\n -----------------------------------------------------------------"
							+ "\n Type 3 for choice 1, or type 4 for choice 2. Which do you choose?";


											if (userAnswer % 2 != 0)
											{
												System.out.println(prompt1);
												userAnswer = in.nextDouble();

											}

											else if (userAnswer % 2 == 0)
											{
												System.out.println(prompt2);
												userAnswer = in.nextDouble();

											}


							//1
							//1, if
							prompt1 =
							"\n Haha just kidding The End. :) Thanks for playing, " + userName;


							//2
							//1, else
							prompt2 =
							"\n  Good choice. The End :) Thanks for playing, " + userName;


										if (userAnswer % 2 != 0)
										{
											System.out.println(prompt1);
											userAnswer = in.nextDouble();

										}

										else if (userAnswer % 2 == 0)
										{
											System.out.println(prompt2);
											userAnswer = in.nextDouble();

										}



		}
}








