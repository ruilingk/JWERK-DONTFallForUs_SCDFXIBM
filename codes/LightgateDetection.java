import java.util.Timer;

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
        } else { // ray_joined = true, no obstacle in the doorway
            if (walking_through_gate) {
                walking_through_gate = false; 
                // finished walking through gate, change state of whether there is a person in the room. 
                if (anybody_in_room) {
                    anybody_in_room = false;
                    time_entered_room = 0; // reset to default
                } else {
                    anybody_in_room = true;
                    time_entered_room = current_time;
                }
            }
        }
    } // close while loop
}
