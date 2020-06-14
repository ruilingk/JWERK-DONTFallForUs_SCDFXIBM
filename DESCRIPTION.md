# DON'T Fall For Us
- Our solution focuses on getting elderly who live alone the help they need in a timely manner. We plan to do this through detecting anomalies in terms of the time spent in certain locations of the house, such as the bathroom, or the kitchen, which could signal a potential accident which requires the attention of a Community First Responder. 
- Our solution integrates both hardware and software to interact with the elderly users. 

## Infrared Light Gates (ILGs)
- ILGs will be strategically placed along doorways in the house which lead to other rooms, such as the bathroom and kitchen, where falling accidents occur most frequently. 
- The ILGs consist of an infrared beam emitter and an infrared light receiver, to detect people entering and leaving a room.
- This data provided by the ILGs is used to compute the timing (refer to LightgateDetection.java) when the user enters the room.
- Each set of ILGs can be configured to have a maximum timing for which the user usually stays in the room. If this timing is exceeded, this signifies an anomaly in the activity patterns of the user, which could be due to an accident, such as falling, or due to other sudden health conditions which prevent them from moving about, such as a stroke. This data will then be sent to AIDssistant to check in on the user, and decide on any further actions to be taken. 
- ILGs will also be installed at the house door, so that the AIDssistant will automatically shut off when the elderly is not around.

## AIDssistant
- AIDssistant is a voice controlled communication bot, which is able to check in on the user based on the data collected by the ILGs, check in on the user at a preset time of the day and give simple reminders to the user, such as reminders to take their medication. 
- AIDssistant will be activated when the ILGs detect that the user has been in a room for an unusually long period of time (refer to AIDssistant.java). In such cases, AIDssistant will check in with the user to ask if they are alright. AIDssistant would then activate the voice input function, and using the Watson Speech to Text function, voice inputs by user will be converted to text. If the user is alright, no further action is taken. However, if the user responds that they are unwell, AIDssistant will send the converted message via the myResponder app to the nearest CFRs. If the user does not respond within a stipulated amount of time, help will also be sent as this could mean that they are unconscious. 
- As a voice activated assistant, AIDssistant will also be set to be activated by certain special keywords which the user may give when they need emergency help.
- AIDssistant can also be set up to check in on the user daily at a fixed time, and see if they are feeling unwell. Should the user indicate he/she is feeling unwell, AIDssistant will then prompt the user to describe his/her symptoms, as well as ask the user a fixed set of questions. The symptoms and answers to the questions are then compiled and converted to text, using Watson Speech to Text function, and sent to the nearest CFRs for assessment. Should the symptoms be the onset symptoms of a condition (stroke etc), the CFRs can then choose to check in on the user. Else, if the CFR deems it to be just a false alarm, they can choose to dismiss the alert.
- AIDssistant can also be set up to provide reminders to the user to take their medication at the necessary timings (customised to each user’s schedule), thus seeking to prevent any mishaps caused by forgetting to take their medication. 
- To make AIDssistant inclusive to all users, AIDssistant should have multiple languages and dialects available. 

## Conclusion
- By combining the Infrared Light Gates and AIDssistant, and leveraging on the existing myResponder app which is used by many Community First Responders, we aim to give elderly who are living alone the help that they need promptly. 
