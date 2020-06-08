package www.top.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class top_activity extends AppCompatActivity {

    RecyclerView rvtop;
    LinearLayoutManager topManager;

    top_adapter top_adapter;
    String title[]={"Universities","Beautiful cities","Rich people","football players","Movies","Animation","Books","Actors","Actresses","Foods",
                    "Genius people","Political countries","Hackers","It companies","Men models","Women models","Musics","Boxers","Successful women",
                    "Applications","Presidents","Places to see","Colours","Instagram bloggers","Fashion bloggers","Programming languages",
                    "Mobile phones","Professors","Dirty cities","Dangerous diseases","Tv channels","Games","Towers","Tourist countries",
                    "Cosmetics brand","Cars","Motorcycle","Business men","Painters","Famous paint","Oldest antiquities","Worst surgery","Invention of century",
                    "Inventors","Men singers","Women singers","Chefs","Doctors","Perfume","Furniture companies","Kitchen utensils","Shoes","Clothes",
                    "Watches","Computers","Television","Eye glasses","Toys","Toothbrush","Sport equipments","Medical devices","Wines","Guns","Coffee","Tea","Dog race",
                    "Horses","Camera","Youtube channels","Good Habits","Web sites","Poor countries","Dangerous animals","Countries with most earthquake",
                    "Famous fruits","Safe countries","Big seas","Famous Island","Inventors who regret making them","Inventions whose inventors are unknown",
                    "Countries with good weather","Countries producing drugs","Fragrant flowers","Poison Reptiles","High growth factors","Reasons for the short stature",
                    "Countries with most imports","Countries with most exports","Countries had most victims of Corona","Countries producing electricity","Oil producing countries",
                    "Active volcano","Countries with diamond mines","Countries with gold mines","Famous poet","Great religions of the world","The world most populous countries",
                    "The world least populous countries","beautiful and famous hotels","Famous museums","Robots"};
    int photo[]={R.drawable.ic_university,R.drawable.beautifulcities,R.drawable.richperson,R.drawable.ic_footballplayers,R.drawable.ic_video_camera,R.drawable.ic_animation,R.drawable.ic_open_book,
            R.drawable.ic_celebrity,R.drawable.ic_actress,R.drawable.ic_food,R.drawable.ic_innovation,R.drawable.ic_political_countries,R.drawable.ic_hacker,R.drawable.itcompany,R.drawable.menmodel,R.drawable.modelwomen
            ,R.drawable.ic_music,R.drawable.ic_boxing,R.drawable.ic_success_women,R.drawable.ic_application,R.drawable.presidents,R.drawable.ic_place,R.drawable.ic_brush,R.drawable.ic_blogger,R.drawable.ic_fashion,R.drawable.ic_programming_lang
            ,R.drawable.ic_smartphone,R.drawable.ic_professor,R.drawable.dirtycities,R.drawable.ic_diseases_diagram,R.drawable.ic_tv,R.drawable.ic_game,R.drawable.ic_tokyo_tower,R.drawable.touristiccountries
            ,R.drawable.ic_cosmetics,R.drawable.ic_car,R.drawable.ic_motorcycle,R.drawable.ic_business_man,R.drawable.ic_painter,R.drawable.ic_mona_lisa,R.drawable.ic_antiquities,R.drawable.ic_surgery,R.drawable.ic_inventioncentury
            ,R.drawable.ic_inventor,R.drawable.ic_men_singer,R.drawable.ic_women_singer,R.drawable.ic_chef,R.drawable.ic_doctor,R.drawable.ic_perfume,R.drawable.ic_furniture,R.drawable.ic_kitchen,R.drawable.ic_shoes,R.drawable.ic_jacket
            ,R.drawable.ic_watch,R.drawable.ic_computer,R.drawable.ic_televesion,R.drawable.ic_glasses,R.drawable.ic_toys,R.drawable.ic_toothbrush,R.drawable.ic_soccer_ball,R.drawable.ic_healthcare_device,R.drawable.ic_wine,R.drawable.ic_gun,R.drawable.ic_coffee,R.drawable.ic_tea,R.drawable.ic_dog
            ,R.drawable.ic_horse,R.drawable.ic_camera,R.drawable.ic_youtube,R.drawable.ic_habit,R.drawable.ic_website,R.drawable.ic_poor,R.drawable.ic_snake,R.drawable.ic_earthquake
            ,R.drawable.ic_fruits,R.drawable.ic_safe_countries,R.drawable.ic_big_seas,R.drawable.ic_famous_island,R.drawable.regret,R.drawable.ic_unknown
            ,R.drawable.ic_good_weather,R.drawable.ic_drugs,R.drawable.ic_flowers,R.drawable.ic_poison_reptiles,R.drawable.ic_high_growth,R.drawable.short_growth
            ,R.drawable.ic_import,R.drawable.ic_export,R.drawable.corona,R.drawable.ic_electricity,R.drawable.ic_oil
            ,R.drawable.ic_volcano,R.drawable.ic_diamond,R.drawable.ic_gold,R.drawable.ic_poet,R.drawable.ic_religions,R.drawable.ic_most_populous
            ,R.drawable.least_populous,R.drawable.ic_hotel,R.drawable.ic_museums,R.drawable.ic_robot
    };
    String details[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);

    rvtop=findViewById(R.id.rvtop);
        topManager=new LinearLayoutManager(top_activity.this,LinearLayoutManager.VERTICAL,false);
        rvtop.setLayoutManager(topManager);

        top_adapter=new top_adapter(title,photo,details,top_activity.this);
        rvtop.setAdapter(top_adapter);


    }
}
