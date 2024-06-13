package ar.edu.utn.dds.k3003.clients;

import ar.edu.utn.dds.k3003.facades.dtos.TrasladoDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface LogisticaRetrofitClient {
    @GET("traslados/search/{colaboradorId}")
    Call<List<TrasladoDTO>> findByTraslado(@Path("colaboradorId") Long colabordorId);

}
