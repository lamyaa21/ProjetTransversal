package booking.hotel.projet.projet.service;

import booking.hotel.projet.projet.model.Chambre;

public interface ChambreService {
    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public boolean deleteChambre(Long chambreId);
    public Chambre getChambresById(long id);
    
}
