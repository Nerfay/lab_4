package com.company;

public class Collaborators {
    private Collaborator[] collaborators;
    private int currentCollaboratorNumber;

    public Collaborators(final int collaboratorsNumber) {
        this.collaborators = new Collaborator[collaboratorsNumber];
        currentCollaboratorNumber = -1;
    }

    public Collaborator findYoungerCollaborator() {
        Collaborator collaborator1 = collaborators[0];
        for (int i = 1; i < collaborators.length; i++) {
            if (collaborators[i].getDateofBirth().isAfter(collaborator1.getDateofBirth()))
                collaborator1 = collaborators[i];
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
