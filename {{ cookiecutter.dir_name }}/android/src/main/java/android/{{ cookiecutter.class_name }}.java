package android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.PythonActivity;

public class {{ cookiecutter.class_name }} extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        startActivity(new Intent({{ cookiecutter.class_name }}.this, PythonActivity.class));
        finish();
    }
}
