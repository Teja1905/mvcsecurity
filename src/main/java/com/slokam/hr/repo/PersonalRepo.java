package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Personal;
				@Repository
				public interface PersonalRepo extends JpaRepository<Personal, Integer> {

				}
