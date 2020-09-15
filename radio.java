package ru.netology;

public class Radio {

    // station
    
    private int currentStationNumber;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    
        public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
    if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }
    
    public int getMinStationNumber() {
        return currentminStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }
    
    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }
    
    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        }
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber = currentStationNumber + 1;
        }
    }
    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        }
        if (currentStationNumber > minStationNumber) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = minStationNumber;
        }
        
    public void selectStation() {
        if (currentStationNumber > maxStationNumber) {
        return;}
        if (currentStationNumber < minStationNumber) {
        return;}
        this.currentStationNumber = currentStationNumber;
        }
    
    
    // volume
        
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;    
    
    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
    
    public int getMinSoundVolume() {
        return currentminSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }
    
    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }
        
    public void plus() {
        if (currentSoundVolume == 0) {
            currentSoundVolume = maxSoundVolume;
        }
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = maxSoundVolume;
        }
    }
    public void minus() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = minSoundVolume;
        }    
            
    }
