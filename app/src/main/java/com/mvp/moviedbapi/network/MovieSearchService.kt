package com.mvp.moviedbapi.network

import com.mvp.moviedbapi.constants.Urls
import com.mvp.moviedbapi.models.apis.SearchResults
import com.newrelic.agent.android.instrumentation.Trace
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Declaration of the [MovieSearchService] allowing to query [com.mvp.moviedbapi.constants.Urls.MOVIEDB_BASE_URL]
 */
interface MovieSearchService {

    @Trace
    @GET("movie?")
    fun getMovies(@Query(Urls.MOVIEDB_API_KEY_QUERY) apiKey: String, @Query(Urls.MOVIEDB_MOVIE_TITLE_QUERY) movieTitle: String, @Query(Urls.MOVIEDB_PAGE_QUERY) page: Int): Observable<SearchResults>

}
