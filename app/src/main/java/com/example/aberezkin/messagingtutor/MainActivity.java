package com.example.aberezkin.messagingtutor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(R.drawable.hermione, "Hermione Granger", "Harry! Where are you? " +
                "Dambledore is looking for..."));
        chats.add(new Chat(R.drawable.ginger, "Ron Weasley", "Wingardium leviosaaaaaaaaaaaaaaaa"));
        chats.add(new Chat(R.drawable.snape, "Severus Snape", "Well, it may have escaped your " +
                "notice, but life is not ..."));
        chats.add(new Chat(R.drawable.iman, "Tony Stark", "I don't know why I'm even chatting with you"));
        chats.add(new Chat(R.drawable.idisuda, "Muzhik", "ubludok mat' tvou a nu idi suda ti govno " +
                "sobachie..."));

        ChatAdapter adapter = new ChatAdapter(this, R.id.listview_chats, chats);

        ListView chatList = (ListView) findViewById(R.id.listview_chats);

        chatList.setAdapter(adapter);

    }
}
