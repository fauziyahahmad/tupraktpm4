package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DramaData extends AppCompatActivity {
    RecyclerView rcv;
    DramaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("2021 ON GOING DRAMA SYNOPSIS");
        rcv = (RecyclerView) findViewById(R.id.recview);
        adapter = new DramaAdapter(getListData(), getApplicationContext());
        rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public static ArrayList<DramaModel> getListData()
    {
        DramaModel dramaModel = null;
        ArrayList<DramaModel> holder=new ArrayList<>();

        DramaModel ob1=new DramaModel();
        ob1.setHeader("Vincenzo");
        ob1.setDesc("At the age of 8, Park Joo-Hyeong went to Italy after he was adopted. He is now an adult and has the name of Vincenzo Cassano (Song Joong-Ki). He is a lawyer, who works for the Mafia as a consigliere. Because of a war between mafia groups, he flees to South Korea. In South Korea, he gets involved with Lawyer Hong Cha-Young (Jeon Yeo-Bin). She is the type of attorney who will do anything to win a case. Vincenzo Cassano falls in love with her. He also achieves social justice by his own way.");
        ob1.setImgname(R.drawable.vincenzo);
        holder.add(ob1);

        DramaModel ob2=new DramaModel();
        ob2.setHeader("Beyond Evil");
        ob2.setDesc("Lee Dong-Sik (Shin Ha-Kyun) was once a capable detective. He now works at the Manyang Police Substation in a small city and does all the tedious chores at the station. His life is quiet there. One day, Detective Han Joo-Won (Yeo Jin-Goo) is transferred to the same police substation. He is assigned to work as Lee Dong-Sik’s boss and also his partner. Han Joo-Won is an elite detective and comes from a distinguished background. His father has a good chance of becoming the next chief at the National Police Agency. Han Joo-Won also has a secret.");
        ob2.setImgname(R.drawable.beyondevil);
        holder.add(ob2);

        DramaModel ob3=new DramaModel();
        ob3.setHeader("Taxi Driver");
        ob3.setDesc("Kim Do-Ki (Lee Je-Hoon) graduated from the Naval Academy and became an UDT (underwater demolition team) Official. His mother was murdered by a serial killer and his life changed afterwards.\n" +
                "\n" +
                "Kim Do-Ki is now a deluxe taxi driver and works for Rainbow Taxi Company. The company is not just an ordinary taxi company. The company offers a special \"revenge-call\" service. If clients ask them to take revenge, Kim Do-Ki and his co-workers will perform the service.");
        ob3.setImgname(R.drawable.taxi);
        holder.add(ob3);

        DramaModel ob4=new DramaModel();
        ob4.setHeader("Hello, Me!");
        ob4.setDesc("Ban Ha-Ni (Choi Gang-Hee) is 37-years-old and a single woman. She holds a temporary position at work, which makes her nervous that she might get fired. She is generally servile and timid. Considering her current state, she does not want to be single. One day, 17-year-old Ban Ha-Ni (Lee Re) from the past comes to 37-year-old Ban Ha-Ni. 17-year-old Ban Ha-Ni is totally different from her older self. The younger Ban Ha-Ni is bright and optimistic.");
        ob4.setImgname(R.drawable.hellome);
        holder.add(ob4);

        DramaModel ob5=new DramaModel();
        ob5.setHeader("Sisyphus: The Myth");
        ob5.setDesc("A time travel story between a genius engineer Han Tae-Sul (Cho Seung-Woo) and his savior from the future Gang Seo-Hae (Park Shin-Hye).\n" +
                "\n" +
                "Han Tae-Sul is a genius engineer and the co-founder of Quantum and Time Company. He is handsome and he produces innovative results. Thanks to his efforts, Quantum and Time has become a world-class enterprise. He is known as a miracle worker and a hero in Korea, but reality is a little different. After his older brother's death 10 years ago, he has exhibited eccentric behavior. The company's stock price has fluctuated accordingly. One day, Han Tae-Sul learns of an unreliable truth behind his brother's death. His dangerous journey begins.\n" +
                "\n" +
                "Gang Seo-Hae is an elite warrior. She can take down the biggest men with just her bare hands. She is also a sharpshooter and able to make bombs. She learned these skills to survive in a world that is dominated by gangsters and military cliques. One day, after a long and dangerous journey, she comes to Han Tae-Sul to save him.");
        ob5.setImgname(R.drawable.sisyphus);
        holder.add(ob5);

        DramaModel ob6=new DramaModel();
        ob6.setHeader("Mouse");
        ob6.setDesc("Jung Ba-Reum (Lee Seung-Gi) is a rookie police officer, working at a police substation. He is an honest person and tries to attain justice. He faces a psychopath murderer, who places the entire nation in fear. Jung Ba-Reum’s life is totally changed afterwards.");
        ob6.setImgname(R.drawable.mouse);
        holder.add(ob6);

        DramaModel ob7=new DramaModel();
        ob7.setHeader("Oh My Ladylord");
        ob7.setDesc("Han Bi-Soo (Lee Min-Ki) is the best thriller drama series screenwriter in South Korea. He is not in an romantic relationship. Oh Joo-In (Nana) is a popular actress. She appears mostly in romantic-comedies, but she's not good with her own romantic relationships. Han Bi-Soo and Oh Joo-In live together.");
        ob7.setImgname(R.drawable.oml);
        holder.add(ob7);

        DramaModel ob8=new DramaModel();
        ob8.setHeader("Not Yet 30");
        ob8.setDesc("\"Not Yet 30\" follows the lives of three female friends in their 30's.\n" +
                "\n" +
                "Seo Ji-Won (Jung In-Sun) is a popular webcomic writer. She visits the publishing company office of her webcomics. There, she meets her first love Lee Seung-Yoo (Kang Min-Hyuk). They knew each other in their middle school days. Lee Seung-Yoo now works as an assistant manager for a planning team at the webcomic publishing company. Meanwhile, Seo Ji-Won gets involved with Cha Do-Hoon (Song Jae-Rim), who is directing a movie that is based on her webcomic.\n" +
                "\n" +
                "Lee Ran-Joo (Hani) works as an announcer. Hong A-Young (Cha Min-Jee) runs a cafe. One day, Hong A-Young’s ex-boyfriend appears in front of her. Meanwhile, Hyeong Joon-Young (Baek Sung-Chul) works part-time at Hong A-Young's cafe. He has feelings for announcer Lee Ran-Joo and confesses his feelings to her.");
        ob8.setImgname(R.drawable.notyet30);
        holder.add(ob8);

        DramaModel ob9=new DramaModel();
        ob9.setHeader("Navillera");
        ob9.setDesc("Sim Deok-Chool (Park In-Hwan) has had a life long dreaming of performing ballet. He is 70-years-old and retired from his job as a post office employee. Due to life situations, he put aside his dream of becoming a ballet dancer and worked a normal job to support his family. Now, Sim Deok-Chool makes the decision to pursue his dream again. His family, including his wife and adult children, are not happy with his decision, but Sim Deok-Chool does not waver in pursuing his life long dream. He joins a ballet company to learn ballet. There, he meets Lee Chae-Rok (Song Kang).\n" +
                "\n" +
                "Lee Chae-Rok is a 23-year-old man. While growing up, he played different sports like baseball, swimming, and soccer, but he wasn't talented in any of those activities. He then became interested in ballet. His mother was a ballet dancer, but she died from a disease when Lee Chae-Rok was young. His father later went bankrupt. Lee Chae-Rok learned that he has a talent for ballet, but, after pursuing ballet, he barely has contact with his father and he has a hard time supporting himself financially. Going through hard times, his desire for ballet fades away. At this time, Sim Deok-Chool appears in front of him.");
        ob9.setImgname(R.drawable.navillera);
        holder.add(ob9);

        DramaModel ob10=new DramaModel();
        ob10.setHeader("L.U.C.A.: The Beginning");
        ob10.setDesc("Ji-O (Kim Rae-Won) has a special power and a secret, but he doesn't know who he really is. He is chased by mysterious figures, while he tries to find answers to numerous questions that surround him.\n" +
                "\n" +
                "Gu-Reum (Lee Da-Hee) is a detective. When she decides on a course of action, she won't change no matter what. Her parents disappeared when she was only a young child. Gu-Reum chases after the truth behind her parents' disappearance. She meets Ji-O and her life changes.");
        ob10.setImgname(R.drawable.luca);
        holder.add(ob10);

        return holder;
    }


}
