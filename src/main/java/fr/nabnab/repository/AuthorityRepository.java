package fr.nabnab.repository;

import fr.nabnab.domain.Authority;

/**
 * Spring Data Couchbase repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {}
