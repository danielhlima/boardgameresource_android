package br.com.boardgameresource.device.androidentities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.core.content.res.ResourcesCompat;

public class ResourceAndr extends br.com.boardgameresource.domain.entities.Resource{

    private Context mContext;

    private Drawable drawable;

    public ResourceAndr(Context context, String name) {
        super(name);
        this.mContext = context;

        Resources res = mContext.getResources();
        int resId = res.getIdentifier(getName(), "drawable", mContext.getPackageName());
        drawable = ResourcesCompat.getDrawable(res, resId, null);
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
