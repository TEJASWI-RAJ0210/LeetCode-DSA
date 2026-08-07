# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        if not root:
            return []

        result = []
        def dfs(node:TreeNode, current_path:str):
            current_path += str(node.val)

            if not node.left and not node.right:
                result.append(current_path)
                return

            if node.left:
                dfs(node.left, current_path + "->")

            if node.right:
                dfs(node.right, current_path + "->")

        dfs(root, "")
        return result
        