package br.com.boardgameresource.device.repositories;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import br.com.boardgameresource.device.androidentities.ResourceAndr;
import br.com.boardgameresource.domain.bus.DataOut;
import br.com.boardgameresource.domain.entities.Resource;
import br.com.boardgameresource.domain.repositories.LoadResourcesRepository;

public class LoadResourcesRepositoriesImpl implements LoadResourcesRepository {

    private Context mContext;

    public LoadResourcesRepositoriesImpl(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void loadResources(DataOut.Callback callback) {

        try{

            List<Resource> resources = new ArrayList<Resource>();
            resources.add(new ResourceAndr(mContext, "gold"));

            callback.onSuccess(resources);
        }catch (Exception e){
            callback.onError(e);
        }
    }
}
