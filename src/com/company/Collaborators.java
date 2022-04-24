package com.company;

public class Collaborators {
    private Collaborator [] collaborators;
    private int currentCollaboratorNumber;

    public Collaborators(final  int collaboratorsNumber) {
        this.collaborators = new Collaborator [collaboratorsNumber];
        currentCollaboratorNumber=-1;
    }
    public Collaborator findНoungerCollaborator() {
        Collaborator collaborator1 = collaborators[0];
        for (final Collaborator collaborator : collaborators) {
            if (collaborator.getDateofBirth().isAfter(collaborator1.getDateofBirth())) collaborator1 = collaborator;
        }

        return collaborator1;
    }

    public void addCollaborator(final Collaborator collaborator) {
        if (++currentCollaboratorNumber < collaborators.length) {
            collaborators[currentCollaboratorNumber] = collaborator;
        }
    }
    public String toString() {
        String result = "Collaborator: " + System.lineSeparator();
        for (final Collaborator collaborator : collaborators) {
            result += collaborator + System.lineSeparator();
        }
        return result;
    }
}
