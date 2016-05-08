package com.example.aberezkin.messagingtutor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatAdapter extends ArrayAdapter<Chat> {

    public ChatAdapter(Context context, int resource, ArrayList<Chat> data) {
        super(context, resource, data);
    }

    public View getView(int position, View view, ViewGroup parent) {
        //Get the instance of our chat
        Chat chat = getItem(position);

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE );

        //Create new list item
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        //Get UI objects
        ImageView profilePic = (ImageView) rowView.findViewById(R.id.profile_pic_imageview);
        TextView nameView = (TextView) rowView.findViewById(R.id.name);
        TextView messageView = (TextView) rowView.findViewById(R.id.message);

        //Set image profile picture
        profilePic.setImageDrawable(getContext().getResources().getDrawable(chat.getProfilePic()));

        //Set text into TextViews
        nameView.setText(chat.getName());
        messageView.setText(chat.getMessage());

        return rowView;
    }

}