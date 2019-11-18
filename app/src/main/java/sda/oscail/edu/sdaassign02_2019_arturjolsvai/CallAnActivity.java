package sda.oscail.edu.sdaassign02_2019_arturjolsvai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallAnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_an);
    }

    public void onReturnClicked(View v)
    {

        EditText editTextTo = (EditText) findViewById(R.id.editText);
        EditText editTextSubject = (EditText) findViewById(R.id.editText2);
        EditText editTextContent = (EditText) findViewById(R.id.editText3);

        String message = editTextTo.getText().toString() + "\r\n" + editTextSubject.getText().toString()
                + "\r\n" + editTextContent.getText().toString();

        String editTextToS = editTextTo.getText().toString();
        String editTextSubjectS = editTextSubject.getText().toString();
        String editTextContentS = editTextContent.getText().toString();

        Intent intent = new Intent(CallAnActivity.this,
                MainActivity.class);

        intent.putExtra("message", message);
        intent.putExtra("mailTo", editTextToS);
        intent.putExtra("subject", editTextSubjectS);
        intent.putExtra("content", editTextContentS);

        startActivity(intent);
    }
}
