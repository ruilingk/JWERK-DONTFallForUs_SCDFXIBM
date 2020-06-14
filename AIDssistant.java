// if user is in room for too long, bot checks on user.
void bot_check_on_user() { // using Watson Speech-to-Text and text-to-Speech functions
    String output;
    String input;
    output : "Are you okay?";
    input = get voice input;
    if (input = "Yes I’m okay.") {} // nothing to do
    else if (input = "A bit unwell.") {
        output = "Please list your symptoms.";
        String symptoms;
        symptoms = get voice input;
        CFR_check(symptoms);
    } else if (input = … (no sound)) {
        CFR_check("No response, might be unconscious.");
        else output : "Please repeat.";
    }
}

//urgent help needed! 
Void CFR_check(String symptoms) { // link to myResponder app
    find_CFR(address);
    System.out.println(“Urgent attention to: ” + User + " " + Address + " " + symptoms);
}

find_CFR(string address) {
    For list of CFR, find location of CFR, 
        return all CFR within 1km radius who have the app running in the background;
    From narrowed down list, map to all distances of elderly’s home to CFR location;
    Sort list;
    Return nearest CFR;
}
