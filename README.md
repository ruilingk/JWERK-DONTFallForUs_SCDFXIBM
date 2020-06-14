# JWERK-DONTFallForUs_SCDFXIBM
We are a group of JC friends studying in different faculties in NUS hoping to contribute back to the society through hackathons. Our team name, **JWERK**, consists of the first letter of our names, Jody, Wen Ling, Emily, Rui Ling and Kirby. 

## Short description
### What is the problem?
Among Singaporeans aged 65 and older, falling is the number one cause of accidental death (Smith, 2018). One in three persons aged 65 years and above fall each year (Low, n.d.). A soon “super-aged” Singapore (Population.sg, n.d.) sees more elderly are living alone than ever. This results in a lack of attention and provision of crucial, emergency aid if they were to fall or have medical emergencies. Once a person has fallen, he or she is twice as likely to fall again (CDC, 2017). However, the ‘golden hour’ to treatment is often lost among these elderly as they live alone and nobody is aware of their emergency situation (Tadiello, 2018). 
### How can technology help?
We propose to utilise technology that leverages on the user’s movement data to detect possible falls or accidents, and mobilise Community First Responders (CFRs), through the existing myResponder application to quickly attend to these elderly. We can thus seize this ‘golden hour’ to provide earlier intervention, by alerting CFRs of the elderly’s emergency needs 24/7 without someone being physically there.
### Our proposed idea
Our proposed idea consists of 2 interdependent parts, targeting elderly aged 65 and above, and living alone, most with no next-of-kin to care for them. Firstly, we have (a) **Infrared Light Gates (ILGs)** and secondly, (b) **AIDssistant** (a voice activated device similar to Google Home). 
- **ILGs** will be installed at key locations in the user’s house, such as bathrooms, where the elderly are more prone to falling. The gates track the duration the user spent in that particular location with minimal infringement of privacy (only duration information is collected and this information is reset once the user leaves the location). Each set of gates will be individually tagged with preset and adjustable timings so that AIDssistant would know when to check on the user. 
- The **AIDssistant** is the bridge between the ILGs and the existing myResponder application currently used by CFRs. It is voice activated, and converts the user’s response to a text alert using Watson Speech to Text. AIDssistant uses the ILG’s information to assess if help should be rendered, proactively check in on the user, and remind the user to take their medicine if needed.

## Link to pitch video

## Architecture of proposed solution
![Architecture of Solution](https://user-images.githubusercontent.com/65802567/84584645-6f2fe480-ae39-11ea-9e27-1b85f9393626.png)
1. The elderly walk past the ILGs.
2. If abnormal activity is detected, for example, being in a particular room for too long, ILGs’ information would be sent to AIDssistant.
3. AIDssistant would then activate the voice input function, and using the Watson Speech to Text function, voice inputs by user will be converted to text.
4. Depending on the response of the user, the message sent to myResponder application will be different.
5. If the user is alright, no further action is taken. However, if the user responds that they are unwell, AIDssistant will send the converted message via the myResponder application to the nearest CFRs. If the user does not respond within a stipulated amount of time, help will also be sent as this could mean that they are unconscious.

## Long description
[View our detailed solution here!](https://github.com/ruilingk/JWERK-DONTFallForUs_SCDFXIBM/blob/master/DESCRIPTION.md)

## Getting started

## Technology used to build our solution
- [IBM Watson Assistant](https://www.ibm.com/cloud/watson-assistant/)
- [Node-RED](https://nodered.org/) - Speech-to-Text and Text-to-Speech functions

## References
Smith, M. L. (2018, October 30). Commentary: The dangers of a fall for the elderly. Retrieved from https://www.channelnewsasia.com/news/commentary/the-dangers-of-a-fall-for-the-elderly-10843932

Low, S. L. (n.d.). Ageing Concerns. Retrieved from https://www.healthxchange.sg/seniors/ageing-concerns/falls-elderly-causes-tips

(n.d.). Retrieved from https://www.population.sg/articles/singapore-a-superaged-country#:~:text=Singapore will make the transition,is not unique to Singapore.&text=By around 2025, Singapore will,aged 65 years and above.

Important Facts about Falls. (2017, February 10). Retrieved from https://www.cdc.gov/homeandrecreationalsafety/falls/adultfalls.html 

Tadiello, J. G. (2018, February 16). Golden Hour is Vital for Treating More Severe Strokes. Retrieved from https://newsroom.clevelandclinic.org/2018/01/25/golden-hour-is-vital-for-treating-more-severe-strokes-cleveland-clinic-study-finds/
