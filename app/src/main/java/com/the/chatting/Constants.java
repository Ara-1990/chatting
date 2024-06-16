package com.the.chatting;

import java.util.HashMap;

public class Constants {

    public static final String KEY_COLlECTION_USERS = "users";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL= "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERANCE_NAME= "chatAppPreferance";
    public static final String KEY_IS_SIGNED_IN = "isSignedId";
    public static final String KEY_USER_ID= "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLECTION_CONVERSATIONS = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABLITY = "availablity";
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATIONS_IDS = "registration_ids";

    public static HashMap<String, String> remoteMsgHeaders = null;

    public static HashMap<String, String> getRemoteMsgHeaders(){
        if (remoteMsgHeaders == null){
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAAgYVqgIE:APA91bGz8XvdYWDMwPS1GgY0NL2JhNqWdDyufgh7zpfH823rT0BEB9enOLjWLbbK1Mfw45ouLgaRt5DjvYJkg3Q21b9xVDrHe3waL_als97KkbMz0Xj4ko7pDNuGduDgoAiI2LR7gcoV"

            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }



}
