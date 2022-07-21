package br.com.dio.app.repositories.core.repositories

import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {

    suspend fun listRepositories(user: String): Flow<List<Repo>>
}