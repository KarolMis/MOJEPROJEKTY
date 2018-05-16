package chain.officer;

import chain.message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public Officer setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
        return this;
    }

    public abstract void processMessage(Message message);
}
