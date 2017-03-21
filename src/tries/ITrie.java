package tries;

import java.util.Set;

public interface ITrie
{
    public void insert(String word);
    
    public boolean hasChild(char letter);
    
    public ITrie getChild(char letter);
    
    public ITrie followPath(String path);

    public boolean contains(String word);
    
    public Set<String> findAllWords();
    
    public Set<String> findCloseWordsChangedLetters(String words, int distance);
    public Set<String> findCloseWordsAddedLetters(String words, int distance);
    public Set<String> findCloseWordsRemovedLetters(String words, int distance);

    public Set<String> findCloseWordsAllChanges(String word, int distance);
    
    public Set<String> findWordsBeginningWith(String prefix);
    
    public Set<String> findWordsContaining(String pattern);
    
    public Set<String> findWordsEndingWith(String suffix);
}
