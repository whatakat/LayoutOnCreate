package com.bankmtk.layoutoncreate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup elements = findViewById(R.id.layout);
        TextView textViewManual = new TextView(this);

        int colorAccent = ContextCompat.getColor(this, R.color.colorAccent);
        textViewManual.setTextColor(colorAccent);
        Typeface typeface = Typeface.create("cursive", Typeface.NORMAL);
        textViewManual.setTypeface(typeface);
        textViewManual.setText("TextView");
        textViewManual.setTextSize(42);
        elements.addView(textViewManual);

        EditText editTextManual = new EditText(this);
        editTextManual.setTextSize(TypedValue.COMPLEX_UNIT_MM, 10);
        editTextManual.setText("42");
        editTextManual.setInputType(InputType.TYPE_CLASS_NUMBER);
        elements.addView(editTextManual);

        Button buttonManual = new Button(this);
        buttonManual.setTextSize(42);
        buttonManual.setText("Button");
        elements.addView(buttonManual);

        CheckBox checkBoxManual = new CheckBox(this);
        checkBoxManual.setTextSize(TypedValue.COMPLEX_UNIT_PX, 50);
        checkBoxManual.setText("CheckBox");
        checkBoxManual.setChecked(true);
        elements.addView(checkBoxManual);

        RadioGroup radioGroupManual = new RadioGroup(this);
        RadioButton radioButton1 = new RadioButton(this);
        radioButton1.setChecked(true);
        radioButton1.setText("RadioButton");
        RadioButton radioButton2 = new RadioButton(this);
        radioButton2.setText("RadioButton");
        radioGroupManual.addView(radioButton1);
        radioGroupManual.addView(radioButton2);
        elements.addView(radioGroupManual);
        radioGroupManual.check(radioButton1.getId());

        ImageView imageViewManual = new ImageView(this);
        imageViewManual.setImageResource(R.drawable.apple);

        ViewGroup.LayoutParams params = elements.getLayoutParams();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.MATCH_PARENT;

        imageViewManual.setLayoutParams(params);
        elements.addView(imageViewManual);

    }
}
