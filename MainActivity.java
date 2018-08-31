package ineedheadling.soundboardv2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton ButtonRM;
    ImageButton ButtonJin;
    ImageButton ButtonSuga;
    ImageButton ButtonJHope;
    ImageButton ButtonJimin;
    ImageButton ButtonTaehyung;
    ImageButton ButtonJungkook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer SoundRM = MediaPlayer.create(this, R.raw.audiofilerm);

        ButtonRM = (ImageButton) findViewById(R.id.Button_RM);

        ButtonRM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundRM.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
        final MediaPlayer SoundJin = MediaPlayer.create(this, R.raw.audiofilejin);

        ButtonJin = (ImageButton) findViewById(R.id.Button_Jin);

        ButtonJin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundJin.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
        final MediaPlayer SoundSuga = MediaPlayer.create(this, R.raw.audiofilesuga);

        ButtonSuga = (ImageButton) findViewById(R.id.Button_Suga);

        ButtonSuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSuga.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
        final MediaPlayer SoundJHope = MediaPlayer.create(this, R.raw.audiofilejhope);

        ButtonJHope = (ImageButton) findViewById(R.id.Button_JHope);

        ButtonJHope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundJHope.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
        final MediaPlayer SoundJimin = MediaPlayer.create(this, R.raw.audiofilejimin);

        ButtonJimin = (ImageButton) findViewById(R.id.Button_Jimin);

        ButtonJimin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundJimin.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
        final MediaPlayer SoundTaehyung = MediaPlayer.create(this, R.raw.audiofiletaehyung);

        ButtonTaehyung = (ImageButton) findViewById(R.id.Button_Taehyung);

        ButtonTaehyung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundTaehyung.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
        final MediaPlayer SoundJungkook = MediaPlayer.create(this, R.raw.audiofilejungkook);

        ButtonJungkook = (ImageButton) findViewById(R.id.Button_Jungkook);

        ButtonJungkook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundJungkook.start();
            }
        });
        /* -----------------------------------------------------------------------------------------*/
    }
}
