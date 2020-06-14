Infrared ray will loop every millisecond
Ray is joined(boolean true)
Ray is blocked(boolean false)

Initially room is empty → boolean Anybody = false
When ray is first blocked and joined (Elderly enters),
boolean Anybody = true

true → false → true, and have no one in room (user enter)
true → false → true, and has people in room (user leaves)

import java.util.Timer;
import everything;
void LightgateDetect() {
    final int preset_max_time_to_stay_in_room = 1000000; // approx 16 min
    int current_time = 0; // default
    int time_entered_room = 0; // default
    boolean anybody_in_room = false; // default
    boolean walking_through_gate = false; // default 

    while (wait(10ms)) {
        if (anybody_in_room && current time != 0) {
            if (time_entered_room + preset_max_time_to_stay_in_room > current_time) {
                check_on_user(); // call method to check on user
            }
        }

        current_time += timer(add 10 millisecond);
        boolean ray_joined = get_state_of_gate(); // ask the lightgate if ray is joined
        if (!ray_joined) {
            if (!walking_through_gate) {
                walking_through_gate = true;
            }
        }
        else { // ray_joined = true, no obstacle in the doorway
            if (walking_through_gate) {
                walking_through_gate = false;
                // finished walking through gate, change state of whether there is a person in the room. 
                if (anybody_in_room) {
                    anybody_in_room = false;
                    time_entered_room = 0; // reset to default
                }
                else {
                    anybody_in_room = true;
                    time_entered_room = current_time;
                }
            }
        }
    } // close while loop
}


// if user is in room for too long, bot checks on user.
void bot_check_on_user() { // using Watson Speech-to-Text and text-to-Speech functions
    String output;
    String input;
    output: "Are you okay?";
    input = get voice input;
    if (input = "Yes I’m okay.") {} // nothing to do
    else if (input = "A bit unwell.") {
        output = "Please list your symptoms.";
        String symptoms;
        symptoms = get voice input;
        CFR_check(symptoms);
    }
    else if (input = …(no sound)) {
        CFR_check("No response, might be unconscious.");
    else output : "Please repeat.";
    }
}

//urgent help needed! 
void CFR_check(String symptoms) { // link to myResponder app
    find_CFR(address);
    System.out.println(“Urgent attention to : ” + User + " " + Address + " " + symptoms);
}


// shortest path (dijkstra’s) thing to find the nearest CFR to the location of elderly
CFR find_CFR(string address) {
    For list of CFR, find location of CFR,
        return all CFR within 1km radius who have the app running in the background;
    From narrowed down list, map to all distances of elderly’s home to CFR location;
    Sort list;
    Return nearest CFR;
}

int get_state_of_gate(){ 
    // Initialize variables
    int IRDetectorPin = 2; // variable for the detector Pin of the photogate
    int photoGate = 0; // stores the state of the photoGate
    int state = 0;
    int cross = 0;

    while(1){
        // read the input pin:
        photoGate = digitalRead(IRDetectorPin); // Gate is HIGH when IR beam is broken.

            if (photoGate == 1) { // gate broken
                cross = 1;
            }
            if (cross == 1) { // if there is a change,
                if (state == 1) { // person WAS in room
                    state = 0;
                    cross = 0;
                } else { // person WAS not in room
                    state = 1; // person-in-room
                    cross = 0;
                }
            }
     }
   return state;
}

Elderly walks through door → blocks infrared ray between lightgate (boolean false) → Scanner detects and records it as Time-in → Ray is joined again (boolean true) 
→ while it is true, timer keeps running
if timing exceeds preset time → send signal to AIDssistant → AIDssistant voice "Are you okay?"

if no response for >= 10 sec OR "HELP" → send alert to myResponder
else if response "I'm okay"
    timer deadline extends by 15 min
    Ask again → loop
else if ray is blocked (boolean false, and then boolean true a few seconds later) because elderly walks through door && timing <= preset time, then reset time