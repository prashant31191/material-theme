package org.polaric.colorful.sample;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import org.polaric.colorful.ColorPickerDialog;
import org.polaric.colorful.Colorful;
import org.polaric.colorful.ColorfulActivity;

public class MainActivity extends ColorfulActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(((Toolbar) findViewById(R.id.toolbar)));

        {
            ColorPickerDialog dialog = new ColorPickerDialog(this);
            dialog.setOnColorSelectedListener(new ColorPickerDialog.OnColorSelectedListener() {
                @Override
                public void onColorSelected(Colorful.ThemeColor color) {
                    //TODO: Do something with the color

                    App.setApplyThemeRuntime(MainActivity.this,color,color);
                    App.showLog("====color====00=="+color.getColorRes());
                    App.showLog("====color====11=="+color.getDarkColorRes());
                }
            });
            dialog.show();
        }
    }
}
