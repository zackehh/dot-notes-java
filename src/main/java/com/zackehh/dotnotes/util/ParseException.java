package com.zackehh.dotnotes.util;

/**
 * Small Exception class for use with parsing errors
 * inside ${@link com.zackehh.dotnotes.DotNotes}. Accepts
 * either an error message or generates an attempted error
 * report from a char, int and boolean.
 */
public class ParseException extends Exception {

    /**
     * Simply accepts a String message and passes it to the super.
     * Nothing fun to see here.
     *
     * @param message the message to pass up
     */
    public ParseException(String message) {
        super(message);
    }

    /**
     * A constructor used to generate an error message based on
     * position in the key parsing. It uses the current character,
     * the index of the character in the String, and a prompt as to
     * whether a brace could be causing the issue to construct a
     * warning to some degree of accuracy.
     *
     * @param current the current character being processed
     * @param index the index of the current character
     * @param brace whether we're trying to process a brace
     */
    public ParseException(char current, int index, boolean brace){
        this("Unable to parse character '" + current + "' at column " + (index + 1) +
             "!" + (brace ? " Did you remember to wrap brace keys in quotes?" : ""));
    }

}