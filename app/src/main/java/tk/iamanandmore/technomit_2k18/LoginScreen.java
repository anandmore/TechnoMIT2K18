package tk.iamanandmore.technomit_2k18;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;
public class LoginScreen extends Activity {
    private EditText inputEmail;
    private EditText inputPassword;
    private ProgressDialog pDialog;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Status = "statusKey";
    SharedPreferences sharedpreferences;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login_screen);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_MULTI_PROCESS);
        if (sharedpreferences.contains(Status)){
            Intent intent = new Intent(LoginScreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    public void login(View view){
        inputEmail=(EditText)findViewById(R.id.editText);
        inputPassword=(EditText)findViewById(R.id.editText2);
        String email = inputEmail.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();
        String anand = "techno@mit.2k18";
        String more = "12345";
        pDialog=new ProgressDialog(this);
        pDialog.setCancelable(false);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_MULTI_PROCESS);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        if (!email.isEmpty() && !password.isEmpty()) {
            if(email.equals(anand)) {
                if(password.equals(more)) {
                    editor.putString(Status,"true");
                    editor.apply();
                    pDialog.setMessage("Loggin in ...");
                    pDialog.show();
                    Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Password is incorrect!", Toast.LENGTH_LONG)
                            .show();
                }
            } else {
                Toast.makeText(getApplicationContext(),
                        "Username is incorrect!", Toast.LENGTH_LONG)
                        .show();
            }
        } else {
            Toast.makeText(getApplicationContext(),
                    "Please enter the credentials!", Toast.LENGTH_LONG)
                    .show();
        }
    }
}