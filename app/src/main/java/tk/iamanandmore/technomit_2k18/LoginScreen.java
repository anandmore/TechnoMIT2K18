package tk.iamanandmore.technomit_2k18;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
public class LoginScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login_screen);
    }
}
