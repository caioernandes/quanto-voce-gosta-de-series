package com.teste.qualserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewEmoji;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitVariables();

        imageViewEmoji.setImageResource(0);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if (seekBar != null) {
                    switch (progress) {
                        case 1:
                            imageViewEmoji.setImageResource(R.drawable.pouco);
                            break;
                        case 2:
                            imageViewEmoji.setImageResource(R.drawable.medio);
                            break;
                        case 3:
                            imageViewEmoji.setImageResource(R.drawable.muito);
                            break;
                        case 4:
                            imageViewEmoji.setImageResource(R.drawable.susto);
                            break;
                        default:
                            imageViewEmoji.setImageResource(0);
                            break;
                    }
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void InitVariables() {
        imageViewEmoji = findViewById(R.id.imageViewEmoji);
        seekBar = findViewById(R.id.seekBarId);
    }
}
