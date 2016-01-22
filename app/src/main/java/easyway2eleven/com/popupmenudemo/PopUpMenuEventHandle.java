package easyway2eleven.com.popupmenudemo;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

/**
 * Created by MMD on 22/01/2016.
 */
public class PopUpMenuEventHandle implements PopupMenu.OnMenuItemClickListener {

    Context context;

    public PopUpMenuEventHandle(Context context) {
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId() == R.id.id_admin){
            Toast.makeText(context, "You really want to login as Admin?", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id_user){
            Toast.makeText(context, "You really want to login as user?", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
