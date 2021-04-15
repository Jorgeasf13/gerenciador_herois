package com.digital_innovationone.heroesapi.repository;
import com.amazonaws.services.dynamodbv2.xspec.S;
import com.digital_innovationone.heroesapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;


@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
