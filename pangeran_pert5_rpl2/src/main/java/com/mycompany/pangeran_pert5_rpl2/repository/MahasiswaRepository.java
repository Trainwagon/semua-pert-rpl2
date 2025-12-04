/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pangeran_pert5_rpl2.repository;

import com.mycompany.pangeran_pert5_rpl2.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Advan
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long>{
    
}
