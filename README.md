# code2040

API chalenges for code2040 2016

This project uses apache's httpClient v4.5.2 and google's gson apis to get input from Code2040's Web Server, compute it and return the results in a json file via POST request.

All work is within the Sender file.

# What was done

 __4 Classes to compute the inputs from the web server were written in order to provide output content for the respetive Json classes in the next topic bellow. The computation classes are:__

- RevString
- NeedleInHaystack
- Prefix
- DateGame

__An inheritance tree of "Json" classes was built around the 2 items to be sent in each chalenge:__ 

__Token: Parent class containing my token__

Token´s children which have more specific components besides token, for example:

- RevStringJson had token string and a string field for its output
- NeedleJson had token string and a needle integer field for its output
- PrefixJson had token string and an array ArrayList field for its output
- DateGameJson had token string and a datestamp string field for its output

__A generic Sender class was created with the sole purpose of sending data via POST method given the destination ip adress and the required of the 4 Json classes above.__

Here were used both google´s Gson and apache httpClient api´s to turn the input Json class into a Json string and make the http request respectively. Handling classpaths in this class was a complex task and required used of an IDE to be done fast.

__Finally, a tester class was written in order to put all structures above to the test:__

1. Get input from the web server
2. Parse Json strings from the input and provide the right parameters for the computation classes
3. Create the Json classes to be used in Sender.sendData(String ip, JsonClass obj)
4. Repeat steps 1 to 3 above for all 4 api challenges.
 
## Final Considerations
Building this application for Code2040´s tech assessment was both challenging and exciting, I had a lot of fun doing it and learned a lot. 
