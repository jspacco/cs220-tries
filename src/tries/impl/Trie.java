package tries.impl;

import tries.ITrie;

public class Trie implements ITrie
{
    public Trie() {
        // TODO Write constructor
    }
    
    /* (non-Javadoc)
     * @see tries.ITrie#insert(java.lang.String)
     */
    @Override
    public void insert(String word) {
        // TODO Auto-generated method stub
        
    }
    
    /* (non-Javadoc)
     * @see tries.ITrie#hasChild(char)
     */
    @Override
    public boolean hasChild(char letter) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#getChild(char)
     */
    @Override
    public ITrie getChild(char letter) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#followPath(java.lang.String)
     */
    @Override
    public ITrie followPath(String path) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#contains(java.lang.String)
     */
    @Override
    public boolean contains(String word) {
        // TODO Auto-generated method stub
        return false;
    }

    
    /* (non-Javadoc)
     * @see tries.ITrie#findAllWords()
     */
    @Override
    public Set<String> findAllWords() {
        // TODO Auto-generated method stub
        return null;
    }
    
    /* (non-Javadoc)
     * @see tries.ITrie#findWordsBeginningWith(java.lang.String)
     */
    @Override
    public Set<String> findWordsBeginningWith(String prefix) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /* (non-Javadoc)
     * @see tries.ITrie#findWordsEndingWith(java.lang.String)
     */
    @Override
    public Set<String> findWordsEndingWith(String suffix) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /* (non-Javadoc)
     * @see tries.ITrie#findWordsContaining(java.lang.String)
     */
    @Override
    public Set<String> findWordsContaining(String patttern) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#findCloseWordsChangedLetters(java.lang.String, int)
     */
    @Override
    public Set<String> findCloseWordsChangedLetters(String words,
        int distance)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#findCloseWordsAddedLetters(java.lang.String, int)
     */
    @Override
    public Set<String> findCloseWordsAddedLetters(String words, int distance) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#findCloseWordsRemovedLetters(java.lang.String, int)
     */
    @Override
    public Set<String> findCloseWordsRemovedLetters(String words,
        int distance)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see tries.ITrie#findCloseWordsAllChanges(java.lang.String, int)
     */
    @Override
    public Set<String> findCloseWordsAllChanges(String word, int distance) {
        // TODO Auto-generated method stub
        return null;
    }

}
