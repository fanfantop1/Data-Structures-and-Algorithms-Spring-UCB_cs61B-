class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def dfs_pre(root):
    if not root:
        return []
    return [root.val] + dfs_pre(root.left) + dfs_pre(root.right)


def dfs_in(root):
    if not root:
        return []
    return dfs_in(root.left) + [root.val] + dfs_in(root.right)


def dfs_post(root):
    if not root:
        return []
    return dfs_post(root.left) + dfs_post(root.right) + [root.val]



root = TreeNode(1,TreeNode(2,TreeNode(3)),TreeNode(4,TreeNode(5),TreeNode(6)))

print(dfs_pre(root))  
print(dfs_in(root))  
print(dfs_post(root))