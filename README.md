# dotp
Double OTP cryptography

The system works in 4 steps by creating a one time pad (OTP) for a message and XOR the message with the OTP, the message is sent where the reciever also creates a OTP for the message and XOR the message with thier OTP, the message is sent back to the sender who XOR the message with their OTP (removing their encryption) and sends the message back to the reciever, the reciever then XOR the message with their OTP to decrypt the message.

OTP works on the principle of having a pad of random values to augment the message against, because the values are random, there is no pattern to find in an effort to break the code. The trouble with computers making a OTP is the numbers are not purely random. To remidy this problem, the algorithem re-seeds the random number generator with a psudo-random number XOR against the next value from the message to make the next random number as random as the pattern in the message. This way, if you are searching for a pattern to seed the random number generator to decode the message with... you would need the message to do so and at that point you no longer need to decrypt anything.
