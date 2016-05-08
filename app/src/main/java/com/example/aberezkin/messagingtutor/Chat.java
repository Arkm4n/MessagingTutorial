package com.example.aberezkin.messagingtutor;

public class Chat {
    private int mProfilePic;
    private String mName;
    private String mMessage;

    public int getProfilePic() {
        return mProfilePic;
    }

    public String getName() {
        return mName;
    }

    public String getMessage() {
        return mMessage;
    }

    Chat(int profilePic, String name, String message) {
        mProfilePic = profilePic;
        mName = name;
        mMessage = message;
    }
}
