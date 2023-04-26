package Casestady.repository.interfaceRepo;

import Casestady.model.Facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IRepository<Facility>{
    List<Facility> showFacilityMaintenance();
}
