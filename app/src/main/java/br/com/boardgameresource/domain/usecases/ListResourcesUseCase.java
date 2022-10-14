package br.com.boardgameresource.domain.usecases;

import java.util.List;

import br.com.boardgameresource.domain.bus.DataOut;
import br.com.boardgameresource.domain.entities.Resource;
import br.com.boardgameresource.domain.repositories.LoadResourcesRepository;

public class ListResourcesUseCase implements DataOut.Callback<List<Resource>> {

    private LoadResourcesRepository repository;
    private DataOut.Callback callback;

    public ListResourcesUseCase(LoadResourcesRepository repository, DataOut.Callback callback) {
        this.repository = repository;
        this.callback = callback;
    }

    public void loadResources(){
        if(repository != null){
            repository.loadResources(this);
        }
    }

    @Override
    public void onSuccess(List<Resource> parameter) {
        callback.onSuccess(parameter);
    }

    @Override
    public void onError(Throwable throwable) {
        callback.onError(throwable);
    }
}
