import Classes.Pupil;

public interface PupilChain {
    void setNextChain(PupilChain nextChain);
    void printField(Pupil pupil);
}
